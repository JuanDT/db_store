package com.store.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.store.model.entities.Product;

public interface IProductDao extends JpaRepository<Product, Integer> {
    
}
