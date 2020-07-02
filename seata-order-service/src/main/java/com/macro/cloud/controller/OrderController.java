package com.macro.cloud.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.macro.cloud.domain.CommonResult;
import com.macro.cloud.domain.Order;
import com.macro.cloud.service.OrderService;

@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 创建订单
     */
    @GetMapping("/create")
    public CommonResult create(Order order) {
	Integer status=  order.getStatus();
	Long productId = order.getProductId();
	Long userId= order.getUserId();
	BigDecimal money = order.getMoney();
	Long id= order.getId();
	Integer count = order.getCount();


	System.out.println("status : " + status + " , productId : " + productId + " , userId : " + userId + " , money : " + money
			+ " , id : " + id + ", count : " + count );
	 
        orderService.create(order);
        return new CommonResult("订单创建成功!", 200);
    }
}
