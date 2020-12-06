package com.example.classpath.config;

import com.example.classpath.naming.MyBeanNameGenerator;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.classpath.config", nameGenerator = MyBeanNameGenerator.class)
public class AppConfig {
}
