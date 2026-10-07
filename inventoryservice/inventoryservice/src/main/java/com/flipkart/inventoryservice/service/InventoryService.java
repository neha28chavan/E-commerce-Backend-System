package com.flipkart.inventoryservice.service;

import org.springframework.stereotype.Service;

import com.flipkart.inventoryservice.entity.InventoryEntity;

@Service
public interface InventoryService {
	
	public InventoryEntity findAllByProductId(Long ProductId);

}
