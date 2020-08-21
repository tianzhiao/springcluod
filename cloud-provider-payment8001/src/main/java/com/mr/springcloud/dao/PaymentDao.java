package com.mr.springcloud.dao;

import com.mr.springcloud.entityes.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {

    public Integer create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

    int delete(@Param("id") Long id);

    Integer update(Payment payment);
}
