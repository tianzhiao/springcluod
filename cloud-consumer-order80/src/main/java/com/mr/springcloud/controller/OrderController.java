package com.mr.springcloud.controller;

import com.mr.springcloud.entityes.CommonResult;
import com.mr.springcloud.entityes.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * TODO
 * @author tza
 * @version 9.9
 * @date 2020/7/31 15:10
 */
@RestController
@Slf4j
public class OrderController {

    @Resource
    private RestTemplate restTemplate;

//    public static final String PAYMENT_URL = "http://localhost:8001";
      public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";



    @GetMapping("/consumer/payment/create")
    public CommonResult create(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment,CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult get(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+ id,CommonResult.class);
    }

    @GetMapping("/consumer/payment/getEntity/{id}")
    public CommonResult<Payment> getEntity(@PathVariable("id") Long id){

        ResponseEntity<CommonResult> forEntity = restTemplate.getForEntity(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);


        if (forEntity.getStatusCode().is2xxSuccessful()) {

            log.debug("{}",forEntity.getHeaders());

            return forEntity.getBody();
        }

        return new CommonResult<>(200,"操作失败");
    }

}
