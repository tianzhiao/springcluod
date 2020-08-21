package com.mr.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName OrderFeignMain80
 * @Description: TODO
 * @Author tianzhiao
 * @Date 2020/8/18
 * @Version V1.09999999999999999
 **/

@EnableFeignClients
@SpringBootApplication
public class OrderFeignMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain80.class,args);
    }
}
