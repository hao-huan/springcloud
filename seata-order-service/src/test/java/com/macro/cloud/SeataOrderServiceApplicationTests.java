package com.macro.cloud;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;

import com.macro.cloud.controller.OrderController;
import com.macro.cloud.domain.Order;
import com.macro.cloud.service.OrderService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SeataOrderServiceApplicationTests {


	@Autowired 
	private OrderService orderService;


	@Autowired
	private OrderController orderController;

	@Test
	public void contextLoads() {
		System.out.println("====test===");
		System.out.println("orderService == null : "  + (this.orderService == null));
		System.out.println("orderController == null : "  + (this.orderController == null));

		Order order = new Order();
		order.setCount(2);
		order.setMoney(BigDecimal.TEN);
		order.setStatus(2);
		order.setUserId(1L);
		order.setProductId(3L);
		this.orderService.create(order);
	}

}
