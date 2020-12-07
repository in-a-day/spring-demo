package com.example.configuration.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class ProgrammaticConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx  = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class, DemoBean1.class);
        ctx.register(DemoBean2.class);
        ctx.refresh();
        DemoBean1 bean1 = ctx.getBean(DemoBean1.class);
        System.out.println(bean1);
        // TODO ctx.scan(), AnnotationConfigWebApplicationContext
    }
}
