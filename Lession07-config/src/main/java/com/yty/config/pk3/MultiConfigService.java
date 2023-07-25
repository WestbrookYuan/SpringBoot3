package com.yty.config.pk3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author yty
 * @version 1.0
 * @since 1.0
 **/
@Service
public class MultiConfigService {
    @Value("${spring.redis.host}")
    private String redisHostName;
    @Value("${spring.datasource.url}")
    private String dburl;

    public void print(){
        System.out.println(dburl + " " + redisHostName);
    }
}
