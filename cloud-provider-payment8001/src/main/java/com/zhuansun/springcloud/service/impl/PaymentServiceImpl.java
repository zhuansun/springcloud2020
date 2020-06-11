package com.zhuansun.springcloud.service.impl;

import com.zhuansun.springcloud.dao.PaymentDao;
import com.zhuansun.springcloud.entities.Payment;
import com.zhuansun.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author EiletXie
 * @Since 2020/3/9 12:02
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}
