package com.kaysanshi.hello.spring.cloud.web.admin.feign.service.impl;

import com.kaysanshi.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

/**
 * @Author kay三石
 * @date:2019/5/27
 */
@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String sayHi(String message) {
        return "Hi，your message is :\"" + message + "\" but request error.";
    }
}
