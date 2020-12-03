package com.example.configuration.generic;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * java泛型可以作为隐式的qualifier
 *
 * @author zbs
 */

@Component
@Data
public class Generics {
    private GenericInterface<String> s;
    private GenericInterface<Integer> i;

    public Generics(GenericInterface<String> s, GenericInterface<Integer> i) {
        this.s = s;
        this.i = i;
    }
}
