package com.yty.config.pk4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author yty
 * @version 1.0
 * @since 1.0
 **/
@Service
public class MultiEnvService {
    @Value("${myapp.memo}")
    private String memo;

    public void printMemo(){
        System.out.println(memo);
    }
}
