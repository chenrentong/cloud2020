package com.atguigu.springcloud.service;

/**
 * @author chenrentong
 * @create 2021-12-12 16:46
 */
public interface StorageService {

    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
