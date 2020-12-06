#### @Required
> 表示属性必须被注入, spring已经舍弃, 建议在方法中使用java代码进行验证

#### @Autowired
> 自动注入属性, list, set, map也可以注入. 当时map时, map的key需要时String类型, 默认注入的key是bean name.

#### @Primary
> 表示当前bean是默认注入的bean. 当同类型存在多个bean时, 使用自动注入将注入该bean.

#### @Qualifier
> 给bean添加限定属性

#### @Resources
> javax注解, 可指定bean name进行注入.

#### @Value
> 可注入配置文件中的属性

#### @Inject
> jsr-330注解, 与@Autowired相比, 没有`required`属性, 可以使用`Optional`接口.

#### @Named
> jsr-330注解, 与@Component相比, 无法复合使用.

#### @ManagedBean


#### @PostConstructor, @PreDestroy
> javax注解, bean初始化后及bean销毁前回调方法

#### Generic as Autowiring qualifier
> 使用java泛型在自动注入时可以作为特殊的类型限定

> `@Autowired, @Inject, @Value, @Resource` 注解由spring的`BeanPostProcessor`实现. 
> 所以无法在自定义的`BeanPostProcessor, BeanFactoryPostProcessor`中使用这些注解, 可以使用xml配置或`@Bean`注解.
