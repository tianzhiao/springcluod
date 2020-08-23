package com.mr.controller;

import com.mr.service.HystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName TestHystrixController
 * @Description: TODO
 * @Author tianzhiao
 * @Date 2020/8/19
 * @Version V1.09999999999999999
 **/
@RestController
@Slf4j
public class TestHystrixController {

    @Resource
    private HystrixService hystrixService;

    @Value("${server.port}")
    private String serverPort;

    /**
     *  commandProperties ： 设置 最大访问时间
     * @param id
     * @return
     */

    @GetMapping("/paymentInfo_ok0/{id}")
    @HystrixCommand(fallbackMethod = "error",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
    })
    public String paymentInfo_ok(@PathVariable Long id){

        try {
            /**
             * 多少时间拆能访问
             */
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        log.debug("serverPort****************** " + serverPort);
        System.out.println("sb bu");
        return hystrixService.paymentInfo_ok(id);
    }


    @GetMapping("/paymentInfo_timeOut")
    @HystrixCommand(fallbackMethod = "paymentInfo_timeOutError",commandProperties = {
            @HystrixProperty(value = "execution.isolation.thread.timeoutInMilliseconds",name = "3000")
    })
    public String paymentInfo_timeOut(){


        String s = hystrixService.paymentInfo_timeOut();
        System.out.println("sb bud=====(￣▽￣*)b");
        return s;
    }


    //===服务熔断
    @GetMapping("/payment/circuit/{id}")
    public String paymentCircuitBreaker(@PathVariable("id") Integer id){
        String result = hystrixService.paymentCircuitBreaker(id);
        log.info("*******result:"+result);
        return result;
    }




    public String error(@PathVariable Long id){
        return "error ";
    }
    public String paymentInfo_timeOutError(@PathVariable Long id){
        return "error ";
    }

}
