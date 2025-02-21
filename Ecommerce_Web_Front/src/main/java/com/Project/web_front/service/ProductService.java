package com.Project.web_front.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Project.web_front.model.Product;
import com.Project.web_front.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository productRepository;
	
	public List<Product> getAllProducts(){
		return productRepository.findAll();
	}
	
	public List<Product> getProductByCategory(Long categoryId){
		return productRepository.findByCategoryId(categoryId);
	}
}
