package com.store.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.store.model.entities.Category;

public interface ICategoryDao extends JpaRepository<Category, Integer>{
    
}
