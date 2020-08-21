package com.mr.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName PeymentFeign
 * @Description: TODO
 * @Author tianzhiao
 * @Date 2020/8/20
 * @Version V1.09999999999999999
 **/

@Component
@FeignClient("CLOUD-PROVIDER-HYSTRIX-PAYMENT")
public interface PeymentFeign {

    @GetMapping("/paymentInfo_ok/{id}")
    public String paymentInfo_ok(@PathVariable Long id);

    @GetMapping("/paymentInfo_timeOut")
    public String paymentInfo_timeOut();

}

