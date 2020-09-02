package com.mr.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName FlowLimitController
 * @Description: TODO
 * @Author tianzhiao
 * @Date 2020/8/29
 * @Version V1.09999999999999999
 **/
@RestController
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA(){
        return "testA";
    }
    @GetMapping("/testD")
    public String testD(){
        return "testD";
    }
}
