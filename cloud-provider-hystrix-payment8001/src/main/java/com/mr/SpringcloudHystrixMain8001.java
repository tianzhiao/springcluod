package com.mr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @ClassName SpringcloudHystrixMain8001
 * @Description: TODO
 * @Author tianzhiao
 * @Date 2020/8/19
 * @Version V1.09999999999999999
 **/

/**
 * EnableHystrix 开启 hystrix
 */

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class SpringcloudHystrixMain8001 {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudHystrixMain8001.class,args);
    }
}
