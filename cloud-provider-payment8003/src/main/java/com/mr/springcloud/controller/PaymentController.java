package com.mr.springcloud.controller;

import com.mr.springcloud.entityes.CommonResult;
import com.mr.springcloud.entityes.Payment;
import com.mr.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * TODO
 *
 * @author tza
 * @version 9.9
 * @date 2020/7/30 21:18
 */

@RestController
@Slf4j
public class PaymentController {


    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;


    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment paymentById = paymentService.getPaymentById(id);
        if(paymentById != null){
            return new CommonResult(200,"success,serverPort: " + serverPort,paymentById);
        }else{
            return new  CommonResult(444,"error",null);
        }
    }

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        Integer result = paymentService.create(payment);
        if(result == 1){
            return new CommonResult(200,"saveSuccess,serverPort: " + serverPort,result);
        }else{
            return new CommonResult(444,"saveError",null);
        }
    }

    @DeleteMapping("/payment/delete/{id}")
    public CommonResult delete(@PathVariable("id") Long id){

        int result = paymentService.delete(id);
        if(result == 0){
            return new CommonResult(200,"删除成功",id);
        }else{
            return new CommonResult(444,"失败",id);
        }
    }


    @PutMapping("/payment/update")
    public CommonResult update(Payment payment){
        Integer result = paymentService.update(payment);
        if(result == 0){
            return new CommonResult(200,"成功",payment);

        }else{
            return new CommonResult(444,"失败",null);
        }
    }
}
