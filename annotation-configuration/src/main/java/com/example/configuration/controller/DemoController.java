package com.example.configuration.controller;

import com.example.configuration.autowired.AutowiredAnnotation;
import com.example.configuration.autowired.AutowiredConstructor;
import com.example.configuration.callbacks.Callbacks;
import com.example.configuration.generic.Generics;
import com.example.configuration.primary.PrimaryAnnotation;
import com.example.configuration.qualifier.QuaInterface;
import com.example.configuration.qualifier.QualifierAnnotation;
import com.example.configuration.required.RequiredAnnotation;
import com.example.configuration.resource.ResourceAnnotation;
import com.example.configuration.value.ValueAnnotation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * @author zbs
 */

@RestController
@RequestMapping("/demo")
public class DemoController {
    private RequiredAnnotation requiredAnnotation;
    private AutowiredAnnotation autowired;
    private AutowiredConstructor autowiredConstructor;
    private PrimaryAnnotation primaryAnnotation;
    private QualifierAnnotation qualifierAnnotation;
    private Generics generics;
    private ResourceAnnotation resourceAnnotation;
    private ValueAnnotation valueAnnotation;
    private Callbacks callbacks;

    public DemoController(RequiredAnnotation requiredAnnotation, AutowiredAnnotation autowired, AutowiredConstructor autowiredConstructor, PrimaryAnnotation primaryAnnotation, QualifierAnnotation qualifierAnnotation, Generics generics, ResourceAnnotation resourceAnnotation, ValueAnnotation valueAnnotation, Callbacks callbacks) {
        this.requiredAnnotation = requiredAnnotation;
        this.autowired = autowired;
        this.autowiredConstructor = autowiredConstructor;
        this.primaryAnnotation = primaryAnnotation;
        this.qualifierAnnotation = qualifierAnnotation;
        this.generics = generics;
        this.resourceAnnotation = resourceAnnotation;
        this.valueAnnotation = valueAnnotation;
        this.callbacks = callbacks;
    }

    @RequestMapping("/required")
    public void required() {
        System.out.println(requiredAnnotation);
    }

    @RequestMapping("/autowired")
    public void autowired() {
        System.out.println(autowired);
    }

    @RequestMapping("/autowired/cons")
    public void autowiredConstructor() {
        System.out.println(autowiredConstructor);
    }

    @RequestMapping("/primary")
    public void primary() {
        primaryAnnotation.getDemoInterface().name();
    }

    @RequestMapping("/qualifier")
    public void qualifier() {
        qualifierAnnotation.getQuaInterface().name();
        Arrays.stream(qualifierAnnotation.getQuaInterfaces()).forEach(QuaInterface::name);
    }

    @RequestMapping("/generic")
    public void generic() {
        generics.getI().type();
        generics.getS().type();
    }

    @RequestMapping("/resource")
    public void resource() {
        System.out.println(resourceAnnotation);
    }

    @RequestMapping("/value")
    public void value() {
        System.out.println(valueAnnotation);
    }

    @RequestMapping("/callbacks")
    public void callbacks() {
        System.out.println(callbacks);
    }
}
