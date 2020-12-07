package com.example.configuration.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.wiring.BeanWiringInfo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationAnnotation {
    // ----- 使用内部bean依赖只有在使用@Configuration注解时才可以这样使用(@Component注解无效) ------

    @Bean
    public BeanOne beanOne() {
        return new BeanOne();
    }

    // --- 由于spring和cglib, beanTwo和beanThree中的beanOne是同一个对象(单例模式下)

    @Bean
    public BeanTwo beanTwo() {
        return new BeanTwo(beanOne());
    }

    @Bean
    public BeanThree beanThree() {
        return new BeanThree(beanOne());
    }

    // ------- TODO Lookup Method Injection ---------


}
