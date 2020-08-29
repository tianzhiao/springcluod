package com.mr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ClassName SpringcloudCnnfigServer3344
 * @Description: TODO
 * @Author tianzhiao
 * @Date 2020/8/24
 * @Version V1.09999999999999999
 **/
@SpringBootApplication
@EnableConfigServer
public class SpringcloudCnnfigServer3344 {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudCnnfigServer3344.class,args);
    }
}
