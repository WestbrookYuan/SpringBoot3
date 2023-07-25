package com.yty.config.pk2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

/**
 * @author yty
 * @version 1.0
 * @since 1.0
 **/
@Service
public class ReadConfig {
    @Autowired
    private Environment environment;

    public void print(){
        String name = environment.getProperty("app.name");
        if (environment.containsProperty("app.owner")){
            System.out.println("owner existed");
        }

        Integer port = environment.getProperty("app.port", Integer.class, 9001);
        System.out.println(name + port);
    }
}
