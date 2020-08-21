package com.mr.service;

import org.omg.CORBA.TIMEOUT;
import org.springframework.stereotype.Component;

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
