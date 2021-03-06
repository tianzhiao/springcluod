package com.mr.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @ClassName ReceiveMessageListenerController
 * @Description: TODO
 * @Author tianzhiao
 * @Date 2020/8/26
 * @Version V1.09999999999999999
 **/
@Component
@EnableBinding(Sink.class)
public class ReceiveMessageListenerController {

    @Value("${server.port}")
    private String serverPort;

    /**
     * StreamListener (流监听器)
     * message.getPayload() 获取8801  发送的消息
     * @param message
     */
    @StreamListener(Sink.INPUT)
    public void input(Message<String> message) {

        System.out.println("消费者1号，接受："+message.getPayload()+"\t port:"+serverPort);
    }

}
