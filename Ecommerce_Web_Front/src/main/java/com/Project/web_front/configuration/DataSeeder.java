package com.Project.web_front.configuration;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Project.web_front.model.Category;
import com.Project.web_front.model.Product;
import com.Project.web_front.repositories.CategoryRepository;
import com.Project.web_front.repositories.ProductRepository;

@Component
public class DataSeeder implements CommandLineRunner{ //command line runner runs when the application start
	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	CategoryRepository categoryRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		//clear all data
		productRepository.deleteAll();
		categoryRepository.deleteAll();
		
		//create category
		Category electronics = new Category();
		electronics.setName("Electronics");
		
		Category clothing = new Category();
		clothing.setName("Clothing");
		
		Category home = new Category();
		home.setName("Home");
		
		categoryRepository.saveAll(Arrays.asList(electronics, clothing,home));
		
		//create products
		Product phone = new Product();
		phone.setName("Smart Phone");
		phone.setDescription("Latest phone with fast charging, amoled display, 64mp camera and more amazing features");
		phone.setImageUrl("https://placehold.co/600x400");
		phone.setPrice(14999.99);
		phone.setCategory(electronics);
		
		Product laptop = new Product();
		laptop.setName("Smart laptop");
		laptop.setDescription("Latest phone with fast charging amazing features");
		laptop.setImageUrl("https://placehold.co/600x400");
		laptop.setPrice(49999.99);
		laptop.setCategory(electronics);
		
		Product jacket = new Product();
		jacket.setName("Summer Jacket");
		jacket.setDescription("Comfortable and cozy jacket");
		jacket.setImageUrl("https://placehold.co/600x400");
		jacket.setPrice(499.99);
		jacket.setCategory(clothing);
		
		Product microwave = new Product();
		microwave.setName("Microwave");
		microwave.setDescription("Microwave with fast heating and so many advance features");
		microwave.setImageUrl("https://placehold.co/600x400");
		microwave.setPrice(4999.99);
		microwave.setCategory(home);
		
		productRepository.saveAll(Arrays.asList(phone, laptop, jacket, microwave));
		
		
	}

}
