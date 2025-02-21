package com.Project.web_front.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.web_front.model.Product;
import com.Project.web_front.service.ProductService;

@RestController
@RequestMapping("api/products")
@CrossOrigin(origins = "http://localhost:5173")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/all")
	public List<Product> getAllProducts(){
		return productService.getAllProducts();
	}
	
	@GetMapping("/category/{categoryId}")
	public List<Product> getProductByCategory(@PathVariable Long categoryId){
		return productService.getProductByCategory(categoryId);
	}
}
