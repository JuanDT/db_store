package com.store.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.store.model.entities.Category;
import com.store.store.repository.ICategoryDao;

@RestController
@RequestMapping("/api/v1")
public class CategoryController {
    @Autowired
    private ICategoryDao categoryRepository;

    @GetMapping("categories")
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @PostMapping("categories")
    public Category createCategory(@RequestBody Category category) {
        return categoryRepository.save(category);
    }

    @GetMapping("categories/{id}")
    public Category getCategoryById(@PathVariable int id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @PutMapping("categories/{id}")
    public Category updateCategory(@PathVariable int id, @RequestBody Category updatedCategory) {
        Category category = categoryRepository.findById(id).orElse(null);

        if (category != null) {
            category.setName(updatedCategory.getName());
            category.setDescription(updatedCategory.getDescription());
            return categoryRepository.save(category);
        }

        return null;
    }

    @DeleteMapping("categories/{id}")
    public void deleteCategory(@PathVariable int id) {
        categoryRepository.deleteById(id);
    }
}
