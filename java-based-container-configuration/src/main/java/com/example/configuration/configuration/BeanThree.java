package com.example.configuration.configuration;

import lombok.Data;

@Data
public class BeanThree {
    private BeanOne beanOne;
    public BeanThree(BeanOne beanOne) {
        this.beanOne = beanOne;
    }
}
