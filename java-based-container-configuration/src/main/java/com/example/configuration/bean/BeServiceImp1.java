package com.example.configuration.bean;

import org.springframework.stereotype.Component;

public class BeServiceImp1 implements BeService{
    @Override
    public void name() {
        System.out.println("bean service imp1");
    }
}
