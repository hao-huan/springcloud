package com.macro.cloud.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import org.apache.ibatis.annotations.Param;

import org.springframework.stereotype.Repository;

import com.macro.cloud.domain.Order;


@Repository
public interface OrderDao extends BaseMapper<Order>{

    /**
     * 创建订单
     */
    void create(Order order);

    /**
     * 修改订单金额
     */
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
