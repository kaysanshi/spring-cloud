package com.kaysanshi.spring.cloud.stream.service;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @Describ: 创建 StreamClient 接口，通过 @Input和 @Output注解定义输入通道和输出通道，另外，@Input 和 @Output 注解都还有一个 value 属性，该属性可以用来设置消息通道的名称，
 * 这里指定的消息通道名称分别是 myInput 和 myOutput。如果直接使用两个注解而没有指定具体的 value 值，则会默认使用方法名作为消息通道的名称
 */
public interface StreamClient {

    String INPUT = "myInput";
    String OUTPUT = "myOutput";

    @Input(StreamClient.INPUT)
    SubscribableChannel input();

    @Output(StreamClient.OUTPUT)
    MessageChannel output();
}
