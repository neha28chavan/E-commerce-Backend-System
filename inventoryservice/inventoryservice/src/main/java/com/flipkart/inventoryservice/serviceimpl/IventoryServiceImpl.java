package com.flipkart.inventoryservice.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.flipkart.inventoryservice.entity.InventoryEntity;
import com.flipkart.inventoryservice.repository.InventoryRepository;
import com.flipkart.inventoryservice.service.InventoryService;

@Component

public class IventoryServiceImpl implements InventoryService {

	@Autowired
	private InventoryRepository inventoryRepository;
	
	@Override
	public InventoryEntity findAllByProductId(Long ProductId) {
		Optional<InventoryEntity> inventoryOptional= inventoryRepository.findByProductId(ProductId);
		if(inventoryOptional.isPresent()) {
			return inventoryOptional.get();
		}else {
			return null;
		}
	}

	
	
	
	
	

}
