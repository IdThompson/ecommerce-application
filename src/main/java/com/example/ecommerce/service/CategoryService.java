package com.example.ecommerce.service;

import com.example.ecommerce.model.Category;
import com.example.ecommerce.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public void createCategory(Category category){
        categoryRepository.save(category);
    }
    public List<Category> listCategory(){
        return categoryRepository.findAll();
    }

    public void editCategory(long categoryId, Category updatecategory) {
        Category category = categoryRepository.getById(categoryId);
        category.setCategoryName(updatecategory.getCategoryName());
        category.setDescription(updatecategory.getDescription());
        category.setImageUrl(updatecategory.getImageUrl());
        categoryRepository.save(category);
    }

    public boolean findById(long categoryId) {
         return categoryRepository.findById(categoryId).isPresent();
    }
}
