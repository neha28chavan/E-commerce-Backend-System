package com.flipkart.orderservice.service;

import java.util.List;

import com.flipkart.orderservice.entity.OrderEntity;


public interface OrderService {

	
	public List<OrderEntity> getAllOrders();
	
	public void saveOrder(OrderEntity orderData);
	
	public OrderEntity getOrderById(Long id);
	
	
}
