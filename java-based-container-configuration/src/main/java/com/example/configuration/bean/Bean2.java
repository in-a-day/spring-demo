package com.example.configuration.bean;

import lombok.Data;

@Data
public class Bean2 {
    public void destroy() {
        System.out.println("-- bean 2 destroy");
    }
}
