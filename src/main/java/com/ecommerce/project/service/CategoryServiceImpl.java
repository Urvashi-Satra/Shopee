package com.ecommerce.project.service;

import com.ecommerce.project.model.Category;
import com.ecommerce.project.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{

    private List<Category> categories = new ArrayList<>();
    private Long nextId = 1L;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategories() {
//        return categories;

        return categoryRepository.findAll();
    }

    @Override
    public void createCategory(Category category) {
//        category.setCategoryId(nextId++);
//        categories.add(category);
        categoryRepository.save(category);

    }

    @Override
    public String deleteCategory(Long categoryId) {
//        List<Category> categories = categoryRepository.findAll();
        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(
                        () -> new ResponseStatusException(HttpStatus.NOT_FOUND ,
                                "Resource not found"));

//        Category categoryDetail = categories.stream()
//                                        .filter(c -> c.getCategoryId().equals(categoryId))
//                                        .findFirst()
//                                        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Resource Not found"));

//        categories.remove(categoryDetail);
        categoryRepository.delete(category);
        return "Category with categoryId: "+categoryId+" Deleted successfully";
    }

    @Override
    public Category updateCategory(Category category, Long categoryId) {
//        Optional<Category> savedCategoryOptional = categoryRepository.findById(categoryId);

        Category savedCategory = categoryRepository.findById(categoryId)
                                                    .orElseThrow(
                                                            () -> new ResponseStatusException(HttpStatus.NOT_FOUND ,
                                                                    "Resource not found"));
        System.out.println(category);

        category.setCategoryId(categoryId);
        category.setCategoryName(category.getCategoryName());
        savedCategory = categoryRepository.save(category);
        return savedCategory;
    }
}

