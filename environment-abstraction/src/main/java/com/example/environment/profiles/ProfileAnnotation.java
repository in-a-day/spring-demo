package com.example.environment.profiles;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Arrays;

/**
 * 测试类中使用ActivateProfile注解进行激活profile
 */
public class ProfileAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        // 不激活默认使用default注解, 也可同时激活多个配置, 但是要注意bean注入名称不能重复复
        ConfigurableEnvironment environment = ctx.getEnvironment();
        System.out.println("--- default profiles ---");
        Arrays.stream(environment.getDefaultProfiles()).forEach(System.out::println);
        System.out.println("------");

        environment.setActiveProfiles("dev", "other");

        System.out.println("--- active profiles ---");
        Arrays.stream(environment.getActiveProfiles()).forEach(System.out::println);
        System.out.println("------");

        ctx.register(ProfileDev.class, ProfileProd.class, ProfileDefault.class, ProfileOther.class, MethodProfile.class);
        ctx.refresh();

        String env = (String) ctx.getBean("env");
        System.out.println(env);

        Double otherNum = ctx.getBean(Double.class);
        System.out.println(otherNum);

        Integer envNum = ctx.getBean(Integer.class);
        System.out.println(envNum);
    }
}
