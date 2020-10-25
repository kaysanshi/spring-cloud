package com.kaysanshi.spring.cloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author kay三石
 * @date:2019/5/28
 */

public class TestConfigController {

    @Value("${foo}")
    private String foo;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String hi(){
        return foo;
    }

}
