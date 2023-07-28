package com.yty.aop.service.impl;

import com.yty.aop.service.SomeService;
import org.springframework.stereotype.Service;

/**
 * @author yty
 * @version 1.0
 * @since 1.0
 **/
@Service
public class SomeServiceImpl implements SomeService {

    @Override
    public void query(Integer id) {
        System.out.println("call query");
    }

    @Override
    public void save(String name, Integer age) {
        System.out.println("call save");
    }
}
