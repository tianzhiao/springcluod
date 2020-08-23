package com.mr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName PaymentHystrixMain8001
 * @Description: TODO
 * @Author tianzhiao
 * @Date 2020/8/20
 * @Version V1.09999999999999999
 **/

@SpringBootApplication
//@EnableCaching // 开启缓存
@EnableFeignClients
@EnableHystrix
//@EnableConfigurationProperties({PeymentFeign.class}) 加载指定的配置类
public class OrderHystrixMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixMain80.class,args);
    }
}
