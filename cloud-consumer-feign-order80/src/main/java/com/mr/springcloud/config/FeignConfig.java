package com.mr.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName FeignConfig
 * @Description: TODO
 * @Author tianzhiao
 * @Date 2020/8/19
 * @Version V1.09999999999999999
 **/

@Configuration
public class FeignConfig {


    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}

