package com.mr.springcloud.service.impl;

import com.mr.springcloud.dao.PaymentDao;
import com.mr.springcloud.entityes.Payment;
import com.mr.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * TODO
 *
 * @author tza
 * @version 9.9
 * @date 2020/7/30 21:16
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public Integer create(Payment payment) {

        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }

    @Override
    public int delete(Long id) {
        return paymentDao.delete(id);
    }

    @Override
    public Integer update(Payment payment) {
        return paymentDao.update(payment);
    }


}
