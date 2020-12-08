package com.example.environment.profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class ProfileDev {
    @Bean
    public String env() {
        return "dev profile";
    }
}
