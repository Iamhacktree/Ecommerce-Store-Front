package com.Project.web_front.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.web_front.model.Category;
import com.Project.web_front.repositories.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	CategoryRepository categoryRepository;
	
	public List<Category> getAllCategories(){
		return categoryRepository.findAll();
	}
}
