package com.example.configuration.annotation;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Data
@Resource
public class DemoBean2 {
    private String str = "jsr-330 bean";
}
