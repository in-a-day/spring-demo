package com.example.configuration.qualifier;

import com.example.configuration.primary.DemoInterface;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 当Autowired有多个类型bean匹配时, 无法自动注入 <br>
 * 使用Qualifier注解根据给定的value注入bean(并不是使用bean name进行匹配, 只是默认情况下qualifier值为bean name) <br>
 * 在bean上指定qualifier值(qualifier值不必是唯一的),
 * 在Autowired中使用Qualifier注解并指定使用qualifier值缩小Autowired类型匹配范围 <br>
 * @author zbs
 */

@Component
@Data
public class QualifierAnnotation {
    private QuaInterface quaInterface;
    /**
     * 使用qualifier限定类型范围为main
     */
    @Autowired
    @Qualifier("main")
    private QuaInterface[] quaInterfaces;

    public QualifierAnnotation(@Qualifier("d3") QuaInterface quaInterface) {
        this.quaInterface = quaInterface;
    }
}
