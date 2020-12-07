package com.example.configuration.configuration;

import lombok.Data;

@Data
public class BeanTwo {
    private BeanOne beanOne;
    public BeanTwo(BeanOne beanOne) {
        this.beanOne = beanOne;
    }
}
