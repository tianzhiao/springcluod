package com.mr.springcloud.controller;

import com.mr.springcloud.entityes.CommonResult;
import com.mr.springcloud.entityes.Payment;
import com.mr.springcloud.service.PaymentFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName OrderFeignController
 * @Description: TODO
 * @Author tianzhiao
 * @Date 2020/8/19
 * @Version V1.09999999999999999
 **/
@RestController
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> get(@PathVariable("id") Long id){

        return paymentFeignService.getPaymentById(id);
    }


    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout(){
        return paymentFeignService.paymentFeignTimeout();
    }
}
