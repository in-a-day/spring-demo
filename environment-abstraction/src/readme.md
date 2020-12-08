### @Profile
- 用于类或方法, 启用相应的配置环境才会加载注解内容(默认配置为default).  
- 使用ApplicationContext的Environment可以手动激活注解.  
- 可以同时激活多个注解.  
- 测试类中使用@ActivateProfile注解启用相应配置
```java
AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
// 不激活默认使用default注解, 也可同时激活多个配置, 但是要注意bean注入名称不能重复复
ConfigurableEnvironment environment = ctx.getEnvironment();
environment.setActiveProfiles("dev", "other");
```


### @PropertySource
- 使用注解添加property属性
- 也可以使用Application的Environment手动添加property  