package com.flipkart.productservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.flipkart.productservice.entity.ProductEntity;
import com.flipkart.productservice.service.ProductService;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "*")
public class ProductController {
	
	
	@Autowired
	private ProductService  productService;
	
	@GetMapping("/products-data")
	public List<ProductEntity> getAllProducts(){
		return productService.getAllProducts();
	}
	
	@PostMapping("/save-products")
	public String saveProduct(@RequestBody ProductEntity productData) {
	 productService.saveProducts(productData);
	 return "Product Saved Successfully";
	 }
	@GetMapping("/products-data/{id}")
	public ProductEntity  getAllProductsById(@PathVariable Long id){
		return productService.getProductsById(id);
	}
	
	

}
