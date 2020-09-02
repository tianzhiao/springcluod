package com.mr.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName MainApplication8401
 * @Description: TODO
 * @Author tianzhiao
 * @Date 2020/8/29
 * @Version V1.09999999999999999
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class MainApplication8401 {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication8401.class, args);
    }
}
    