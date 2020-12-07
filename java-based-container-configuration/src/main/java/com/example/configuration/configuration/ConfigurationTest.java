package com.example.configuration.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigurationTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(ComposedConfiguration.class);
        ctx.refresh();

        BeanTwo beanTwo = ctx.getBean(BeanTwo.class);
        BeanThree beanThree = ctx.getBean(BeanThree.class);
        System.out.println(beanTwo);
        System.out.println(beanThree);
        BeanFour beanFour = ctx.getBean(BeanFour.class);
    }
}
