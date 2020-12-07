package com.example.configuration.bean;

import lombok.Data;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Data
public class BeanTest {
    private BeService beService;
    public BeanTest(BeService beService) {
        this.beService = beService;
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
        BeanTest bean = ctx.getBean(BeanTest.class);
        bean.beService.name();

        Bean3 bean3 = ctx.getBean(Bean3.class);
        Bean3 bean31 = ctx.getBean(Bean3.class);
        System.out.println(bean3);
        System.out.println(bean31);

        Bean4 bean4 = (Bean4) ctx.getBean("bean-4");
        System.out.println(bean4);

    }
}
