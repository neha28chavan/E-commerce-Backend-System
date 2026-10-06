package com.flipkart.productservice.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.flipkart.productservice.entity.ProductEntity;

@Service

public interface ProductService {
	
	public List<ProductEntity> getAllProducts();
	
	public void saveProducts(ProductEntity productData);
	
	public ProductEntity getProductsById(Long id);
	

}
