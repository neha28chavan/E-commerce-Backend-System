package com.flipkart.orderservice.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.flipkart.orderservice.entity.OrderEntity;
import com.flipkart.orderservice.repository.OrderRepository;
import com.flipkart.orderservice.service.OrderService;

@Component
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderRepository orderRepo;
	
	
	@Override
	public List<OrderEntity> getAllOrders() {
		return orderRepo.findAll();
	}


	@Override
	public void saveOrder(OrderEntity orderData) {
		orderRepo.save(orderData);
		
	}


	@Override
	public OrderEntity getOrderById(Long id) {
		return orderRepo.findById(id).get();
	}


	

}
