package com.ecommerce.project.service;

import com.ecommerce.project.model.Category;
import com.ecommerce.project.payload.CategoryDTO;
import com.ecommerce.project.payload.CategoryResponse;
import org.springframework.context.annotation.Bean;

import java.util.List;


public interface CategoryService {

//    List<Category> getAllCategories();
    CategoryResponse getAllCategories();

//    void createCategory(Category category);
    CategoryDTO createCategory(CategoryDTO category);


    String deleteCategory(Long categoryId);

    Category updateCategory(Category category, Long categoryId);
}
