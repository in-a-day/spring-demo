#### BeanPostProcessor
```java
/**
 * 每个bean初始化之前触发函数, 通常在这里处理注解等信息
 */
default Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
    return bean;
}


/**
 * bean实例化完成后触发函数, 通常在这里使用代理
 */
default Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    return bean;
}
```

#### BeanFactoryProcessor