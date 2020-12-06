package com.example.classpath.naming;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * 自定义bean name, 必须要有无参构造函数
 */
public class MyBeanNameGenerator implements BeanNameGenerator {
    public MyBeanNameGenerator() {
    }

    @Override
    public String generateBeanName(BeanDefinition definition, BeanDefinitionRegistry registry) {
        System.out.println("---- gen bean name ---");
        return "my-" + definition.getBeanClassName();
    }
}
