package com.example.configuration.callbacks;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * @author zbs
 */

@Data
@Component
public class Callbacks {
    @Resource
    private CabBean cabBean;

    @PostConstruct
    private void afterConstruct() {
        System.out.println("after construct ....");
        System.out.println(cabBean);
        this.cabBean = null;
    }

    @PreDestroy
    private void beforeDestroy() {
        System.out.println(cabBean);
        System.out.println("before destroy ....");
    }
}
