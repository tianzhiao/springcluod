package com.mr.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * TODO
 *
 * @author tza
 * @version 9.9
 * @date 2020/8/8 11:37
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZkMain80 {

   public static void main(String[] args) {
           SpringApplication.run(OrderZkMain80.class,args);
   }

}
