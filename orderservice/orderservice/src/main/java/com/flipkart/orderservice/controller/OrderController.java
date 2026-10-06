package com.flipkart.orderservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.flipkart.orderservice.entity.OrderEntity;
import com.flipkart.orderservice.service.OrderService;


@RestController
@RequestMapping("/orders")
@CrossOrigin(origins = "*")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/Orders-data")
	public List<OrderEntity> getAllOrders(){
		return orderService.getAllOrders();
	}
	
	@PostMapping("/place-orders")
	public String saveOrders(@RequestBody OrderEntity orderData) {
		
		
		String inventoryServiceUrl="http://inventory-service/inventory/check/"+orderData.getProductId();
		Boolean isInventoryAvaiable = restTemplate.getForObject(inventoryServiceUrl, Boolean.class);
		
		if(isInventoryAvaiable) {
			orderService.saveOrder(orderData);
			return "Order Saved Successfully";
		}else {
			return "Order out of stock";
		}
		
	}
	
	@GetMapping("/orders-data/{id}")
	public OrderEntity getOrderById(@PathVariable Long id){
		return orderService.getOrderById(id);
	}
	
	
	

}

	
	
	
	
	