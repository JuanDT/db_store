package com.store.store.service;

import java.util.List;

import com.store.store.model.entities.Category;

public interface CategoryService {
    List<Category> getAllCategories();
    Category getCategoryById(int id);
    Category createCategory(Category category);
    Category updateCategory(int id, Category updatedCategory);
    void deleteCategory(int id);
    
}