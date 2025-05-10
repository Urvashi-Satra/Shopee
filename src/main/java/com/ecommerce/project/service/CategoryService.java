package com.ecommerce.project.service;

import com.ecommerce.project.model.Category;
import com.ecommerce.project.payload.CategoryDTO;
import com.ecommerce.project.payload.CategoryResponse;
import org.springframework.context.annotation.Bean;

import java.util.List;


public interface CategoryService {

//    List<Category> getAllCategories();
    CategoryResponse getAllCategories(Integer pageNumber,Integer pageSize);

//    void createCategory(Category category);
    CategoryDTO createCategory(CategoryDTO category);


    CategoryDTO deleteCategory(Long categoryId);

    CategoryDTO updateCategory(CategoryDTO category, Long categoryId);
}
