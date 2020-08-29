package com.mr.controller;

import com.mr.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName SendMessageController
 * @Description: TODO
 * @Author tianzhiao
 * @Date 2020/8/26
 * @Version V1.09999999999999999
 **/
@RestController
public class SendMessageController {

    @Resource
    private IMessageProvider iMessageProvider;

    @GetMapping("/sendMessage")
    public String sendMessage(){
        iMessageProvider.send();
        return "*****************************************************************";
    }
}
