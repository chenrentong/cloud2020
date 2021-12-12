package com.atguigu.cloudalibaba.service.impl;

import com.atguigu.cloudalibaba.service.PaymentService;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author chenrentong
 * @create 2021-12-12 12:31
 */
@Component
public class PaymentFallbackService implements PaymentService {

    @Override
    public CommonResult<Payment> paymentSQL(Long id)
    {
        return new CommonResult<>(444,"服务降级返回,没有该流水信息",new Payment(id, "errorSerial......"));
    }

}
