package com.mr.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.Random;

/**
 * TODO
 *
 * @author tza
 * @version 9.9
 * @date 2020/8/7 21:59
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8004 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class,args);
    }
}
