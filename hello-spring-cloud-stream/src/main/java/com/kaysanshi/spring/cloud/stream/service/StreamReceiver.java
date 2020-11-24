package com.kaysanshi.spring.cloud.stream.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 * @EnableBind注解 : 用于指定一个或多个定义了@input或@Output注解的接口，从此实现对消息通道(Channel)的绑定。
 * @StreamListener: 主要定义在方法上，作用是将被修饰的方法上注册为消息中间件上数据流的事件监听器，注解中的属性值对应了监听器的消息通道名。
 *
 * @EnableBinding 对应的两个接口属性 Source 和 Sink 是 SCS 内部提供的。
 * SCS 内部会基于 Source 和 Sink 构造 BindableProxyFactory，且对应的 output 和 input 方法返回的 MessageChannel 是 DirectChannel。
 * output 和 input 方法修饰的注解对应的 value 是配置文件中 binding 的 name
 */

@Component
@EnableBinding(value = {StreamClient.class})
public class StreamReceiver {

    private Logger logger = LoggerFactory.getLogger(StreamReceiver.class);

    @StreamListener(StreamClient.INPUT)
    public void receive(String message){
        logger.info("StreamReceiver:{}",message);
    }

}
