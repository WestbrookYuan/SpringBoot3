package com.yty.pk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author yty
 * @version 1.0
 * @since 1.0
 **/
@RestController
public class HelloController {
    @Autowired
    private Date mydate;
    @GetMapping("/hello")

    public String hello(){
        return "welcome to springboot3" + mydate.toString();
    }
}
