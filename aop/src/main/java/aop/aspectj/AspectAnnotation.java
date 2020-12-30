package aop.aspectj;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * <p>@Aspect无法被自动扫描到, 需要使用@Component注解.</p>
 * Spring中切面无法成为其他切面通知目标
 */
@Aspect
@Component
@Slf4j
public class AspectAnnotation {
    /**
     *  使用pointcut定义切点, 可以在advice中引用
     */
    @Pointcut("execution(* aop.aspectj.DemoService.hello(..))")
    public void helloMatcher() {}

    @Pointcut("execution(* aop.aspectj.DemoService.bye(..))")
    public void byeMatcher() {}

    /**
     * 直接定义切点
     */
    @Before("execution(* aop.aspectj.DemoService.hello(..))")
    public void before() {
        log.info("==> before(hello)");
    }

    @After("helloMatcher()")
    public void afterFinally() {
        log.info("==> after finally(hello)");
    }

    @AfterReturning("helloMatcher()")
    public void afterReturning() {
        log.info("==> after returning(hello)");
    }

    @AfterReturning(pointcut = "execution(* aop.aspectj.DemoService.exec(..))", returning = "ret")
    public void afterReturningWithArg(Object ret) {
        log.info("==> returning val(exec): {}", ret);
    }

    /**
     * 仅在JoinPoint产生指定异常时才执行
     * @param throwable
     */
    @AfterThrowing(pointcut = "byeMatcher()", throwing = "e")
    public void afterThrowing(ArithmeticException e) {
        log.info("==> after throwing match ArithmeticException (bye)");
    }

    @After("byeMatcher()")
    public void afterBye() {
        log.info("==> after (bye)");
    }

    @Around("byeMatcher()")
    public void around(ProceedingJoinPoint pj) {
        try {
            log.info("==> around before(bye)");
            pj.proceed();
            pj.proceed();
            log.info("==> around after(bye)");
        } catch (ArithmeticException e) {
            log.info("==> around throwing match ArithmeticException (bye) ");
            e.printStackTrace();
        } catch (RuntimeException e) {
            log.info("==> around throwing match RuntimeException (bye) ");
            e.printStackTrace();
        } catch (Throwable throwable) {
            log.info("==> around throwing(bye) ");
            throwable.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception{
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        DemoService demo = ctx.getBean(DemoService.class);
        log.info("---------------------------------------");
        demo.hello();
        log.info("---------------------------------------");
        demo.exec();
        log.info("---------------------------------------");
        demo.bye();
        log.info("---------------------------------------");
    }
}
