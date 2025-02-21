package com.Project.web_front.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.web_front.model.Category;
import com.Project.web_front.service.CategoryService;

@RestController
@RequestMapping("api/categories")
@CrossOrigin(origins = "http://localhost:5173")
public class CategoryController {
	@Autowired
	CategoryService categoryService;
	
	@GetMapping 
	public List<Category> getAllCategories(){
		return categoryService.getAllCategories();
	}
}
