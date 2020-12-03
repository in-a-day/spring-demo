package com.example.configuration.primary;

import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * 如果Autowired有多个类型bean匹配, 无法自动注入 <br>
 * 使用Primary注解bean, 则默认注入的bean即为该bean
 * @author zbs
 */

@Data
@Component
@Primary
public class DemoImpl1 implements DemoInterface{
    @Override
    public void name() {
        System.out.println("demo impl 1");
    }
}
