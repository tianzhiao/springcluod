package com.mr.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MySeltRule
 * @Description: TODO
 * @Author tianzhiao
 * @Date 2020/8/17
 * @Version V1.09999999999999999
 **/
@Configuration
public class MySeltRule {

    @Bean
    public IRule myRule(){
        return new RandomRule();//定义为随机
    }

}
