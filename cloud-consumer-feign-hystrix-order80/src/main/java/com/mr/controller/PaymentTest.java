package com.mr.controller;

import com.mr.service.impl.PaymentFallbackServerImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName PaymentTest
 * @Description: TODO
 * @Author tianzhiao
 * @Date 2020/8/20
 * @Version V1.09999999999999999
 **/
@Component
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT",fallback = PaymentFallbackServerImpl.class)
public interface PaymentTest {


    @GetMapping("/paymentInfo_ok0/{id}")
    public String paymentInfo_OK(@PathVariable("id") Long id);

    @GetMapping("/paymentInfo_timeOut")
    public String paymentInfo_TimeOut();
}
