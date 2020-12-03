#### @Required

#### @Autowired

#### @Primary

#### @Qualifier

#### @Resources

#### @Value

#### @PostConstructor, @PreDestroy

#### Generic as Autowiring qualifier

> `@Autowired, @Inject, @Value, @Resource` 注解由spring的`BeanPostProcessor`实现. 
> 所以无法在自定义的`BeanPostProcessor, BeanFactoryPostProcessor`中使用这些注解, 可以使用xml配置或`@Bean`注解.
