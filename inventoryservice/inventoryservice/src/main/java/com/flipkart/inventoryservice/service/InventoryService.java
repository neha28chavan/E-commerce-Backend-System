package com.flipkart.inventoryservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.flipkart.inventoryservice.entity.InventoryEntity;

@Service
public interface InventoryService {
	
	public InventoryEntity findAllByProductId(Long ProductId);

}
