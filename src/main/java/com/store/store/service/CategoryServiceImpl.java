package com.store.store.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.store.store.model.entities.Category;
import com.store.store.repository.ICategoryDao;

public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private ICategoryDao categoryRepository;

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getCategoryById(int id) {
        return categoryRepository.findById(id).orElse(null);
    }
}
