package com.mr.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName PaymentHystrixService
 * @Description: TODO
 * @Author tianzhiao
 * @Date 2020/8/20
 * @Version V1.09999999999999999
 **/

@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT")
@Component
public interface PaymentHystrixService {


    @GetMapping("/paymentInfo_ok")
    public String paymentInfo_ok(@RequestParam Long id);

    @GetMapping("/paymentInfo_timeOut")
    public String paymentInfo_timeOut();


}
