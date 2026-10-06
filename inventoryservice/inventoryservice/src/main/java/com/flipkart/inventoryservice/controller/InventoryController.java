package com.flipkart.inventoryservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flipkart.inventoryservice.entity.InventoryEntity;
import com.flipkart.inventoryservice.service.InventoryService;

@RestController
@RequestMapping("/inventory")
@CrossOrigin(origins = "*")
public class InventoryController {

	@Autowired
	private InventoryService inventoryService;
	
	@GetMapping("/check/{productId}")
	public boolean checkStook(@PathVariable Long productId) {
		InventoryEntity inventoryData = inventoryService.findAllByProductId(productId);
		if(inventoryData !=null && inventoryData.getQuantity() > 0) {
			return true;
		}else {
			return false;
		}
	}
	
}
