package aop.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectAnnotation {
    @Before("execution(** aop.aspectj.DemoService.hello(..))")
    public void before() {
        System.out.println("==> before");
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        DemoService bean = ctx.getBean(DemoService.class);
        bean.hello();
    }
}
