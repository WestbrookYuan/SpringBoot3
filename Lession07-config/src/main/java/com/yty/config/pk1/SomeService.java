package com.yty.config.pk1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.StringJoiner;

/**
 * @author yty
 * @version 1.0
 * @since 1.0
 **/
@Service
public class SomeService {
    @Value("${app.name}")
    public String name;
    @Value("${app.owner}")
    public String owner;
    @Value("${app.port:8008}")
    public Integer port;
    public void printValue(){
        StringJoiner stringJoiner = new StringJoiner(",");
        stringJoiner.add(name).add(owner).add(String.valueOf(port));
        System.out.println(stringJoiner.toString());
    }
}
