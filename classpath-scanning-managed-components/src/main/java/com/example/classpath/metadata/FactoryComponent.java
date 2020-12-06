package com.example.classpath.metadata;

import org.springframework.beans.factory.InjectionPoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class FactoryComponent {
    /**
     * @Bean注册bean实例, 提供元数据
     * @return
     */
    @Bean("meBean")
    public MeBean publicInstance() {
        return new MeBean("public MeBean");
    }

    /**
     * TODO 理解injectionPoint
     * @param injectionPoint
     * @return
     */
    @Bean
    @Scope("prototype")
    public MeBean2 prototypeInstance(InjectionPoint injectionPoint) {
        return new MeBean2("prototype for: " + injectionPoint.getMember());
    }
}
