package com.store.store.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.store.model.entities.Product;
import com.store.store.repository.IProductDao;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private IProductDao productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(int id) {
        return productRepository.findById(id).orElse(null);
    }
}
