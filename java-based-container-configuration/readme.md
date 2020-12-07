### @Bean
> 用于表明一个方法实例化, 配置, 初始化由Spring IoC容器管理的对象.
> 该注解可与Spring的任意@Component注解一起使用, 通常与@Configuration一起使用.


### @Configuration
> 用@Configuration注解的类表明主要用途是作为bean定义的源.


### AnnotationConfigApplicationContext
- 该注解可以接受@Configuration, 通用@Component注解的类, 以及JSR-330元注解所注解的类.