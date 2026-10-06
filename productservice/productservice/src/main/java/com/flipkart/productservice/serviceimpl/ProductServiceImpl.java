package com.flipkart.productservice.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.flipkart.productservice.entity.ProductEntity;
import com.flipkart.productservice.repository.ProductRepository;
import com.flipkart.productservice.service.ProductService;

@Component


public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<ProductEntity> getAllProducts() {
		return productRepository.findAll();
	}
	

	@Override
	public void saveProducts(ProductEntity productData) {
		productRepository.save(productData);
		
	}

	@Override
		public ProductEntity getProductsById(Long id) {
			return productRepository.findById(id).get();
		}

		
	

}
