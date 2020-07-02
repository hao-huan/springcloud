package com.macro.cloud.service;


import com.baomidou.mybatisplus.extension.service.IService;

import com.macro.cloud.domain.Order;

public interface OrderService extends IService<Order>{

    /**
     * 创建订单
     */
    void create(Order order);
}
