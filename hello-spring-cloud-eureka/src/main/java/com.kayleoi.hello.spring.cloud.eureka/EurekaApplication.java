package com.kayleoi.hello.spring.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author kay三石
 * @date:2019/5/25
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    public  static void main(String[] args){

        SpringApplication.run(EurekaApplication.class,args);
    }
}
