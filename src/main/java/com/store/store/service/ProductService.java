package com.store.store.service;

import java.util.List;

import com.store.store.model.entities.Product;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(int id);
}
