package com.mr.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
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
@DefaultProperties(defaultFallback = "common_fallback")
public class OrderHystrixController {

    @Resource
    private PaymentTest PaymentTest;

    @GetMapping("/hystrix/paymentInfo_ok/{id}")
    @HystrixCommand(fallbackMethod = "errorOK",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "2000")
    })
    public String paymentInfo_OK(@PathVariable Long id){

        log.debug("serverPort****************** " );
        System.out.println("sb bu************************");
        return PaymentTest.paymentInfo_OK(id);
    }

    public String errorOK(@PathVariable Long id){

        return  "errorOK";
    }

    public String errorTime(){

        return "errorTime";
    }


    @GetMapping("/hystrix/paymentInfo_timeOut")
    @HystrixCommand(fallbackMethod ="errorTime",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1500")
    })
    public String paymentInfo_timeOut(){

        try {
            /**
             * 多少时间拆能访问
             */
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String s = PaymentTest.paymentInfo_TimeOut();
        System.out.println("sb b*******************************************************************************u");
        return "s";
    }

    @GetMapping("/testFallbqck")
    @HystrixCommand
    public String testFallback(){

        System.out.println(1 / 0);
        return "(*^_^*)";
    }


    public String common_fallback(){

        return  "************************************/(ㄒoㄒ)/~~*****************************************";
    }


}
