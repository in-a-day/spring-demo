package com.example.environment.property;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;

public class PropertySourceAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ConfigurableEnvironment environment = ctx.getEnvironment();
        ctx.register(AnnotatedProperty.class);
        ctx.refresh();
        environment.getPropertySources().forEach(System.out::println);
        // TODO 编程式添加property
    }
}
