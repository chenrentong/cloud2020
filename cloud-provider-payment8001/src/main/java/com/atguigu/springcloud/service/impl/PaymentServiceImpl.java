package com.atguigu.springcloud.service.impl;

/**
 * @author chenrentong
 * @create 2021-11-27 17:51
 */

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById( Long id){

        return paymentDao.getPaymentById(id);

    }
}

