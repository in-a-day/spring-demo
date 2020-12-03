package com.example.configuration.primary;

import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author zbs
 */

@Data
@Component
public class DemoImpl2 implements DemoInterface{
    @Override
    public void name() {
        System.out.println("demo impl 2");
    }
}
