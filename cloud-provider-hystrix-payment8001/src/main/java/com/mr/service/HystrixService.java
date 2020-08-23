package com.mr.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.omg.CORBA.TIMEOUT;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName HystrixService
 * @Description: TODO
 * @Author tianzhiao
 * @Date 2020/8/19
 * @Version V1.09999999999999999
 **/
@Component
public class HystrixService {




    //服务熔断
    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),  //是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),  //请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),  //时间范围
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60"), //失败率达到多少后跳闸
    })
    public String paymentCircuitBreaker(@PathVariable("id") Integer id){
        if (id < 0){
            throw new RuntimeException("*****id 不能负数");
        }
        String serialNumber = IdUtil.simpleUUID();

        return Thread.currentThread().getName()+"\t"+"调用成功,流水号："+serialNumber;
    }
    public String paymentCircuitBreaker_fallback(@PathVariable("id") Integer id){
        return "id 不能负数，请稍候再试,(┬＿┬)/~~    id: " +id;
    }




    public String paymentInfo_ok(Long id){
        /**
         * 线程池
         */
        String name = Thread.currentThread().getName();
/*
        Integer timeOut = 3;

        try {
           TimeUnit.SECONDS.sleep(timeOut);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        String result = "线程池 = " + name + "*******,id = " + id + "***************";

        return result;
    }



    public String paymentInfo_timeOut(){
        /**
         * 线程池
         */
        String name = Thread.currentThread().getName();

        Integer timeOut = 3;

        try {
            TimeUnit.SECONDS.sleep(timeOut);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String result = "线程池 = " + name + "*******,id = " + "" + "***************,timeout = " + timeOut;

        return result;
    }
}
