package com.yty.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.StringJoiner;

/**
 * @author yty
 * @version 1.0
 * @since 1.0
 **/
@Component
@Aspect
public class LogAspect {
    // enhance
    @Before("execution(* com.yty.aop.service..*.*(..))")
    public void sysLog(JoinPoint jp){
        StringJoiner logger = new StringJoiner(",", "{", "}");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        logger.add(dateTimeFormatter.format(LocalDateTime.now()));

        String name = jp.getSignature().getName();
        logger.add(name);
        Object[] args = jp.getArgs();
        for (Object o: args){
            logger.add(o==null? "-": o.toString());
        }
        System.out.println(logger);
    }
}
