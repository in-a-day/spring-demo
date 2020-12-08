package com.example.environment.profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class ProfileProd {
    @Bean
    public String env() {
        return "prod profile";
    }
}
