package com.atguigu.springcloud.alibaba.service;

import com.atguigu.springcloud.alibaba.domain.Order;

/**
 * @author chenrentong
 * @create 2021-12-12 15:44
 */
public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);
}
