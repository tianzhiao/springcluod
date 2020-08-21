package com.mr.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName OrderConsulController
 * @Description: TODO
 * @Author tianzhiao
 * @Date 2020/8/12
 * @Version V1.09999999999999999
 **/

@RestController
public class OrderConsulController {

    public static final String INVOME_URL  = "http://consul-consumer-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/consul")
    public String payment(){
        return restTemplate.getForObject(INVOME_URL+"/payment/consul",String.class);
    }
}
