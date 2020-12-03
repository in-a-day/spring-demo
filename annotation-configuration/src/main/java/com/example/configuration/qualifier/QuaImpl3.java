package com.example.configuration.qualifier;

import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author zbs
 */

@Data
@Component
@Qualifier("d3")
public class QuaImpl3 implements QuaInterface {
    @Override
    public void name() {
        System.out.println("qua demo 3");
    }
}
