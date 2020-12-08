package com.example.environment.profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("default")
public class ProfileDefault {
    @Bean
    public String env() {
        return "default profile";
    }
}
