package com.kaysanshi.spring.cloud.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author kay三石
 * 这里的配置中只有是这样的配置才可以用到config中的客户端形式指定出这个配置就可以。
 * @date:2019/5/28
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientApplication {
   public static void main(String[] args){
       SpringApplication.run(ConfigClientApplication.class,args);
   }
}
