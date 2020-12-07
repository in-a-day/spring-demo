package com.example.configuration.annotation;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class DemoBean1 {
    private String str = "component bean";
}
