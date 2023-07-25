package com.yty.pk;

import lombok.val;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Date;

/**
 * 核心注解 SprinBootApplication
 * @SpringBootConfiguration Java configuration 将@Bean注入到spring的IOC容器
 * 有@SpringBootConfiguration就是配置类
 * @EnableAutoConfiguration
 * 开启自动配置，可以将Spring和第三方对象配置好，注入进Spring容器，避免写xml，去掉样例代码
 * @ComponentScan
 * 组件扫描器，<context:component-scan base-package=""/>
 * 扫描@Controller，@Service，@Repository，@Component，创建他们的包并注入容器，
 * 约定：启动类，作为扫描包的起点，扫描com.yty.pk和他的子包中的所有的类
 */
@SpringBootApplication
public class Lession06PackageApplication {
    @Bean
    /**
     * 注入容器中
     */
    public Date myDate(){
        return new Date();
    }
    public static void main(String[] args) {
        // run方法，第一个配置类是源
        // Lession06PackageApplication.class 源类 将各种bean配置好并注入
        // 返回容器对象
        ApplicationContext ctx = SpringApplication.run(Lession06PackageApplication.class, args);
        Date date = ctx.getBean(Date.class);

    }

}
