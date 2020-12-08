package com.example.environment.profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("other")
public class ProfileOther {
    @Bean
    public Double otherNum() {
        return 0D;
    }
}
