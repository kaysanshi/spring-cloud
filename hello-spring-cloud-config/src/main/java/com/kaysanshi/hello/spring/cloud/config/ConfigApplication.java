package com.kaysanshi.hello.spring.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author kay三石
 * @date:2019/5/28
 * 分布式配置中心其实就是一个配置你的配置文件在哪个地方，就是在哪个地方配置
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigApplication {

    public static void main(String[] args){
        SpringApplication.run(ConfigApplication.class,args);
    }


}
