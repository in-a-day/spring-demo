package com.example.configuration.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * AnnotationConfigApplicationContext不仅可以使用Configuration注解, 也可使用任意@Component注解或jsr-330注解.
 */
public class AnnotationConfig {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class, DemoBean1.class, DemoBean2.class);
        AppConfig appConfig = ctx.getBean(AppConfig.class);
        String str = ctx.getBean(String.class);
        DemoBean1 bean1 = ctx.getBean(DemoBean1.class);
        DemoBean2 bean2 = ctx.getBean(DemoBean2.class);
        System.out.println(appConfig);
        System.out.println(str);
        System.out.println(bean1);
        System.out.println(bean2);
    }
}
