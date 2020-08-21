package com.mr.springcloud.service;

import com.mr.springcloud.entityes.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName PaymentFeignService
 * @Description: TODO
 * @Author tianzhiao
 * @Date 2020/8/19
 * @Version V1.09999999999999999
 **/
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
@Component
public interface PaymentFeignService {


    @GetMapping(value = "/payment/get/{id}")
    CommonResult getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();

}
