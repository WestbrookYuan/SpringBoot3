package com.yty.config;

import com.yty.config.pk1.SomeService;
import com.yty.config.pk2.ReadConfig;
import com.yty.config.pk3.MultiConfigService;
import com.yty.config.pk4.MultiEnvService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Lession07ConfigApplicationTests {

    @Autowired
    private SomeService service;
    @Test
    void contextLoads() {
    }

    @Test
    void testProperties(){
        service.printValue();
    }
    @Autowired
    private ReadConfig readConfig;
    @Test
    void testEnvironment(){
        readConfig.print();
    }

    @Autowired
    private MultiConfigService multiConfigService;
    @Test
    void MultiConfigTest(){
        multiConfigService.print();
    }

    @Autowired private MultiEnvService multiEnvService;
    @Test void MultiEnvConfigTest(){
        multiEnvService.printMemo();
    }

}
