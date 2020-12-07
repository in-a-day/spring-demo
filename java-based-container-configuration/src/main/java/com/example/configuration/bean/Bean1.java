package com.example.configuration.bean;

import lombok.Data;

@Data
public class Bean1 {
    public void init() {
        System.out.println("-- bean 1 init --");
    }
}
