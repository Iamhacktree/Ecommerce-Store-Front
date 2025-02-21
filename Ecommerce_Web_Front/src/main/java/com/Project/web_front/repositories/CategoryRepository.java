package com.Project.web_front.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Project.web_front.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
