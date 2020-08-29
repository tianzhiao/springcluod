package com.mr.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName OrderController
 * @Description: TODO
 * @Author tianzhiao
 * @Date 2020/8/26
 * @Version V1.09999999999999999
 **/

@RestController
public class OrderController {

    @Resource
    private RestTemplate template;

    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    @GetMapping(value = "/consumer/payment/nacos/{id}")
    public String paymentInfo(@PathVariable("id") Integer id){

        return template.getForObject(serverURL + "/payment/nacos/"+ id ,String.class);
    }

}
