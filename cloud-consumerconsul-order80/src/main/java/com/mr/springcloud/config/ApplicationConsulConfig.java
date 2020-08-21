package com.mr.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ApplicationConsulConfig
 * @Description: TODO
 * @Author tianzhiao
 * @Date 2020/8/12
 * @Version V1.09999999999999999
 **/
@Configuration
public class ApplicationConsulConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
