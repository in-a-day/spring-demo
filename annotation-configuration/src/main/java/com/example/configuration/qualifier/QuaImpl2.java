package com.example.configuration.qualifier;

import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author zbs
 */

@Data
@Component
@Qualifier("main")
public class QuaImpl2 implements QuaInterface {
    @Override
    public void name() {
        System.out.println("qua demo 2");
    }
}
