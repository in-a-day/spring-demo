package com.example.configuration.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 使用Import注解后, 加载ComposedConfiguration同时也会加载ConfigurationAnnotation
 */
@Configuration
@Import(ConfigurationAnnotation.class)
public class ComposedConfiguration {
    @Bean
    public BeanFour beanFour() {
        return new BeanFour();
    }

    // 可以使用Autowired自动注入
    @Autowired
    private BeanOne beanOne;

    // 也可以使用Autowired注入配置类, 但也增加了耦合
//    @Autowired
//    private ConfigurationAnnotation configurationAnnotation;
}
