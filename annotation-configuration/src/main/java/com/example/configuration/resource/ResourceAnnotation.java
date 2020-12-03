package com.example.configuration.resource;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Resource注解是javax提供的注解, java11后javax从java核心包中移除, 需要添加依赖 <br>
 * Resource注解根据name进行匹配, spring解析Resource注解规则:
 * 如果未提供name,
 *   当注解是字段时: 根据字段名称匹配;
 *   当注解是setter方法时: 根据方法参数名称匹配;
 * 如果都未匹配, 则与Autowired注解相似: 使用类型进行匹配
 * @author zbs
 */

@Data
@Component
public class ResourceAnnotation {
    /**
     * Resource注解不指定name默认以字段名称匹配
     */
    @Resource
    private ReBean1 reBean1;
    /**
     * 未指定name且字段名称无法匹配bean name, 使用类型匹配
     */
    @Resource
    private ReBean1 re;
    private ReBean1 re1;

    @Resource
    private ReBean2 reBean2;
    /**
     * 指定名称匹配
     */
    @Resource(name = "reBean2")
    private ReBean2 re2;

    @Resource
    private ReBean2[] reBean2s;

    /**
     * setter不指定name, 默认以参数名称名称进行匹配
     * @param re1
     */
    @Resource
    public void setRe1(ReBean1 re1) {
        this.re1 = re1;
    }
}
