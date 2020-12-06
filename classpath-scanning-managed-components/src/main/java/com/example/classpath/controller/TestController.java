package com.example.classpath.controller;

import com.example.classpath.metadata.MeBean;
import com.example.classpath.metadata.MeBean2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/demo")
public class TestController {
    @Autowired
    private MeBean meBean;
    @Autowired
    private MeBean2 meBean2;

    @RequestMapping("/metadata")
    public void metadata() {
        System.out.println(meBean);
    }

    @RequestMapping("/meBean2")
    public void meBean2() {
        System.out.println(meBean2);
    }


}
