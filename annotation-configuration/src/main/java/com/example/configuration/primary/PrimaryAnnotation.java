package com.example.configuration.primary;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author zbs
 */

@Component
@Data
public class PrimaryAnnotation {
    private DemoInterface demoInterface;

    public PrimaryAnnotation(DemoInterface demoInterface) {
        this.demoInterface = demoInterface;
    }
}
