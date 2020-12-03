package com.example.extension.extensions;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author zbs
 */

@Component
public class BeanFactoryProcessDemo implements BeanFactoryPostProcessor {
    // TODO meaning
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("++++ post process bean factory");
        System.out.println(beanFactory);
    }
}
