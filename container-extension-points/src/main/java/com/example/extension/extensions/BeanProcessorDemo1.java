package com.example.extension.extensions;

import com.example.extension.annotations.ClassName;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;

/**
 * @author zbs
 */

@Component
@Order(1)
public class BeanProcessorDemo1 implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Annotation[] annotations = bean.getClass().getAnnotationsByType(ClassName.class);
        ClassName annotation = bean.getClass().getAnnotation(ClassName.class);
        if (annotation != null)
            System.out.printf("bean: %s, class: %s, annotated by %s, annotation value: %s \n",
                    beanName, bean.getClass(), ClassName.class, annotation.value());

        System.out.printf("post before(1), bean name: %s \n", beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.printf("post after(1), bean name: %s \n", beanName);
        return bean;
    }
}
