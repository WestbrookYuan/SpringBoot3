# SpringBoot3 自动配置机制

@EnableAutoConfiguration：启动自动配置

@Import(AutoConfigurationImportSelector.class)：加载文件：读取自动配置类的列表，Springboot便利列表，加载各个

配置类

XXXAutoConfiguration：比如Aop的自动配置类，Mybatis的自动配置类：

​	实例化对象：@Conditional，当符合条件时自动配置有效

​	starter依赖：提供依赖和配置类，这样Springboot才会读取，进行自动配置

​	会读取XXXProperties绑定Bean，加载application中的配置项

![image-20230727170849739](/Users/yuantengyan/Library/Application Support/typora-user-images/image-20230727170849739.png)