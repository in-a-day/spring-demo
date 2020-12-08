package com.example.environment.profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * 方法上使用Profile注解
 * Profile("default")表示默认配置下使用该配置
 */
@Configuration
public class MethodProfile {
    @Bean("envNum")
    @Profile("dev")
    public Integer numDev() {
        return 0;
    }

    @Bean("envNum")
    @Profile("prod")
    public Integer numProd() {
        return 1;
    }

    @Bean("envNum")
    @Profile("default")
    public Integer numDefault() {
        return 2;
    }
}
