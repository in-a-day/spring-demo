package com.example.configuration.generic;

import org.springframework.stereotype.Component;

/**
 * @author zbs
 */

@Component
public class GenImp1 implements GenericInterface<String>{
    @Override
    public void type() {
        System.out.println("generic: String");
    }
}
