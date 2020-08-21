package com.mr.controller;

import com.mr.service.PaymentHystrixService;
import com.mr.service.PeymentFeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName OrderHystrixController
 * @Description: TODO
 * @Author tianzhiao
 * @Date 2020/8/20
 * @Version V1.09999999999999999
 **/

@RestController
@Slf4j
public class OrderHystrixController {

    @Resource
    private PaymentTest PaymentTest;

    @GetMapping("/hystrix/paymentInfo_ok/{id}")
    public String paymentInfo_ok(@PathVariable Long id){

        log.debug("serverPort****************** " );
        System.out.println("sb bu************************");
        return PaymentTest.paymentInfo_OK(id);
    }


    @GetMapping("/hystrix/paymentInfo_timeOut")
    public String paymentInfo_timeOut(){

        String s = PaymentTest.paymentInfo_TimeOut();
        System.out.println("sb b*******************************************************************************u");
        return "s";
    }


}
