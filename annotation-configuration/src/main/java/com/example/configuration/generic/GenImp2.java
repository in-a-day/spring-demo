package com.example.configuration.generic;

import org.springframework.stereotype.Component;

/**
 * @author zbs
 */

@Component
public class GenImp2 implements GenericInterface<Integer>{
    @Override
    public void type() {
        System.out.println("generic: Integer");
    }
}
