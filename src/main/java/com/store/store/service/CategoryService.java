package com.store.store.service;

import java.util.List;

import com.store.store.model.entities.Category;

public interface CategoryService {
    List<Category> getAllCategories();
    Category getCategoryById(int id);
    
}