package com.example.configuration.bean;

import org.springframework.context.annotation.*;


/**
 * Bean注解
 * 默认使用函数名称作为bean name, 可以指定name属性(或者默认属性)定义bean name(传入数组则作为别名) <br>
 * 使用Description注解添加说明 <br>
 * 可以接受任意参数依赖进行构造bean <br>
 * 可以进行接口类型转换 <br>
 * 使用initMethod属性和destroyMethod属性指定初始化函数和销毁函数.
 *
 */
@Configuration
public class BeanConfig {
    // --------------- 类型转换 --------------------
    @Bean
    @Primary
    public BeService trans() {
        return new BeServiceImp1();
    }

    @Bean
    public BeServiceImp2 beServiceImp2() {
        return new BeServiceImp2();
    }

    // --------------- 参数依赖 -----------------------------
    /**
     * 可以用于任意参数依赖
     * @param beService
     * @return
     */
    @Bean
    public BeanTest initDependency(BeService beService) {
        return new BeanTest(beService);
    }

    // ------------------ 生命周期回调 -----------------------

    @Bean(initMethod = "init")
    public Bean1 bean1() {
        return new Bean1();
    }

    /**
     * 建议使用此方式进行初始化操作, 不需要依赖容器回调
     * @return
     */
    @Bean
    public Bean1 innerInit() {
        Bean1 bean1 = new Bean1();
        bean1.init();
        return bean1;
    }

    @Bean(destroyMethod = "destroy")
    public Bean2 bean2() {
        return new Bean2();
    }

    // ----------------- Scope ---------------------- TODO scoped-proxy

    @Bean
    @Scope("prototype")
    public Bean3 bean3() {
        return new Bean3();
    }

    // ----------------- bean name, alias, description --------------------

    @Bean(name = {"bean4", "bean-4"})
    @Description("This is bean-4 description.")
    public Bean4 bean4() {
        return new Bean4();
    }


}
