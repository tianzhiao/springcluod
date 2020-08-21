package com.mr.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @ClassName ConsulController
 * @Description: TODO
 * @Author tianzhiao
 * @Date 2020/8/12
 * @Version V1.09999999999999999
 **/

@RestController
public class ConsulController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/consul")
    public String paymentconsul(){
        return "springcloud with consul:"+serverPort+"\t"+ UUID.randomUUID().toString();
    }


}
