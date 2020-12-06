## Classpath Scanning and Managed Components

### Stereotype Anotations
#### @Component
> 元注解(meta-annotation), 可以用于注解其他注解

#### @Repository
> 持久层(persistence)

#### @Service
> 服务层(service)

#### @Controller
> 表现层(presentation)

#### @RestController
> 复合注解(composed annotation), 由@Controller和@ResponseBody构成
> 复合注解可以重新定义元注解中的属性.


### Automatically Detecting Classes and Registering Bean Definitions
- 自动检测和注册相应的bean, 需要在@Configuration的类中添加@Component注解.
```java
/**
 * basePackages指定需要扫描的包
 * 也可以使用默认的value属性即: @ComponentScan("org.example")
 */
@Configuration
@ComponentScan(basePackages = "org.example")
public class AppConfig {

}
```
- 使用注解扫描元素时, 隐式的包含了`AutowiredAnnotationBeanPostProcess`和`CommonAnnotationBeanPostProcess`.



### Using Filters to Customize Scanning
- 使用@ComponetScan注解的`includeFilters`和`excludeFilters`属性可以自定义扫描属性.
- TODO demo


### Defining Bean MetaData within Components
> Spring 组件可以天添加bean定义元数据. 使用在被@Configuration注解的类中使用@Bean注解即可.

























