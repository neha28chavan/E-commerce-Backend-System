package com.flipkart.inventoryservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flipkart.inventoryservice.entity.InventoryEntity;

@Repository
public interface InventoryRepository extends JpaRepository<InventoryEntity ,Long> {
	
	public Optional<InventoryEntity> findByProductId(Long productId);

}
