package com.example.configuration.bean;

import org.springframework.stereotype.Component;

public interface BeService {
    default void name() {
        System.out.println("bean service");
    }
}
