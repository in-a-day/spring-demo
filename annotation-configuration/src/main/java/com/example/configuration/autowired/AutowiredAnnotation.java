package com.example.configuration.autowired;

import com.example.configuration.beans.CommonBean;
import com.example.configuration.beans.CommonBean1;
import com.example.configuration.beans.CommonBean2;
import com.example.configuration.beans.CommonBean3;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Autowired注解使用类型匹配
 * @author zbs
 */

@Component
@Data
public class AutowiredAnnotation {
    private CommonBean commonBean;
    private CommonBean1 commonBean1;
    private CommonBean2 commonBean2;
    private CommonBean3 commonBean3;
    /**
     * 字段使用Autowired(不推荐)
     */
    @Autowired
    private List<CommonBean> commonBeanList;
    @Autowired
    private CommonBean[] commonBeans;
    /**
     * required=false, spring 未找到合适注入类型时, 跳过注入
     */
    @Autowired(required = false)
    private Set<String> strs;
    /**
     * 当map的key是String类型时可以注入, key未spring所定义bean的name
     */
    @Autowired
    private Map<String, CommonBean> commonBeanMap;

    /**
     * 自spring4.3, 如果bean只有一个构造函数, 那么不需要使用Autowired注解 <br>
     * 私有方法不影响注入 <br>
     * 如果存在多个构造方法且未使用Autowired注解, 则会使用满足数量最多依赖的构造方法
     *
     * @param commonBean
     */
    private AutowiredAnnotation(CommonBean commonBean) {
        this.commonBean = commonBean;
    }

    /**
     * 在setter方法上使用Autowired
     * @param bean1
     */
    @Autowired
    public void setCommonBean1(CommonBean1 commonBean1) {
        this.commonBean1 = commonBean1;
    }

    /**
     * 任意参数, 任意名称函数使用Autowired
     * @param commonBean2
     * @param commonBean3
     */
    @Autowired
    public void init(CommonBean2 commonBean2, CommonBean3 commonBean3) {
        this.commonBean2 = commonBean2;
        this.commonBean3 = commonBean3;
    }

}
