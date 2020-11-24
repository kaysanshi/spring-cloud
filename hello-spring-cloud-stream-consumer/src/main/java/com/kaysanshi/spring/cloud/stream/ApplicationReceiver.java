package com.kaysanshi.spring.cloud.stream;

import com.kaysanshi.spring.cloud.stream.service.StreamClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date: 2020/11/24
 * @Auth: kaysanshi
 * @Describ: springcloudstream使用 发布订阅模式  消费者，就是消息接收着
 * Spring Cloud Stream 是一个用来为微服务应用构建消息驱动能力的框架，它可以基于Spring Boot来创建独立的、可用于生产的Spring应用程序。
 * 它通过使用Spring Integration来连接消息代理中间件以实现消息事件驱动的微服务应用。
 * Spring Cloud Stream为一些供应商的消息中间件产品提供了个性化的自动化配置实现，并且引入了发布-订阅、消费组以及消息分区这三个核心概念。
 *
 */
@SpringBootApplication
@RestController
public class ApplicationReceiver {
    public static  void main(String[] args){
        SpringApplication.run(ApplicationReceiver.class);
    }
}
