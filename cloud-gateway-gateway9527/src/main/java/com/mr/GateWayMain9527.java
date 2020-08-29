package com.mr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName GateWayMain9527
 * @Description: TODO
 * @Author tianzhiao
 * @Date 2020/8/23
 * @Version V1.09999999999999999
 **/

@SpringBootApplication
@EnableEurekaClient //声明注册 eureka
public class GateWayMain9527 {


    /**
     * 主启动
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(GateWayMain9527.class,args);
    }
}
