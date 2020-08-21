package com.mr.springcloud.service;

import com.mr.springcloud.entityes.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {

    public Integer create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);


    int delete(@Param("id") Long id);

    Integer update( Payment Payment);
}
