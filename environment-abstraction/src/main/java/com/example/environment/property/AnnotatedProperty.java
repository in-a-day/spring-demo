package com.example.environment.property;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 使用@ProperSource注解添加property <br>
 * 也可以编程式地从environment添加
 */
@Configuration
@PropertySource("classpath:application-my.properties")
public class AnnotatedProperty {
}
