package com.example.configuration.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration注解类以及内部使用Bean注解的方法都会注册为bean.
 */
@Configuration
public class AppConfig {
    @Bean
    public String demoStrBean() {
        return "configuration bean";
    }
}
