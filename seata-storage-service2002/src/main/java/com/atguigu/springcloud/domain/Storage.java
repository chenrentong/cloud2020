package com.atguigu.springcloud.domain;

import lombok.Data;

/**
 * @author chenrentong
 * @create 2021-12-12 16:44
 */
@Data
public class Storage {

    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;
}

