package com.mr.service.impl;

import com.mr.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @ClassName IMessageProviderImpl
 * @Description: TODO
 * @Author tianzhiao
 * @Date 2020/8/25
 * @Version V1.09999999999999999
 **/
@Service
@EnableBinding(Source.class)
public class IMessageProviderImpl implements IMessageProvider {

    @Resource
    private MessageChannel output;

    /**
     * 发送者 IMessageProviderImpl
     * @return
     */
    @Override
    public String send() {
        String s = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(s).build());
        System.out.println("**************************************** MessageChannel " + s);
        return null;
    }
}
