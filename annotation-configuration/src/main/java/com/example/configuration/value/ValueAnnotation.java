package com.example.configuration.value;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Value注解获取配置属性 <br>
 * 如果属性不存在将会得到注解的值(eg, @Value("${hhh}"), 会得到${hhh}) <br>
 * 如果启用了strict模式, 属性不存在将会在spring初始化时抛出异常(spring boot默认开启) <br>
 * TODO 自定义placeholder, ConversionService
 *
 * @author zbs
 */

@Data
@Component
public class ValueAnnotation {
    @Value("${server.port}")
    private String port;

    /**
     * 设置默认值
     */
    @Value("${hhh: zzz}")
    private String notExist;
}
