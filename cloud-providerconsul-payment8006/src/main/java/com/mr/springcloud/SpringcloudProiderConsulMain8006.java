package com.mr.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName SpringcloudProiderConsulMain8006
 * @Description: TODO
 * @Author tianzhiao
 * @Date 2020/8/12
 * @Version V1.09999999999999999
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudProiderConsulMain8006 {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudProiderConsulMain8006.class,args);
    }
}
