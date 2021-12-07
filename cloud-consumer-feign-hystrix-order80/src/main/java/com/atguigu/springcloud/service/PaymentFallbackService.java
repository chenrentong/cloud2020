package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author chenrentong
 * @create 2021-12-08 0:51
 */
@Component
public class PaymentFallbackService implements  PaymentHystrixService{

    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK , (┬＿┬)";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut , (┬＿┬)";
    }
}
