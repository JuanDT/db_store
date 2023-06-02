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

import com.store.store.model.entities.Product;
import com.store.store.repository.IProductDao;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
    @Autowired
    private IProductDao productRepository;

    @GetMapping("products")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @PostMapping("products")
    public Product createProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @GetMapping("products/{id}")
    public Product getProductById(@PathVariable int id) {
        return productRepository.findById(id).orElse(null);
    }

    @PutMapping("products/{id}")
    public Product updateProduct(@PathVariable int id, @RequestBody Product updatedProduct) {
        Product product = productRepository.findById(id).orElse(null);

        if (product != null) {
            product.setName(updatedProduct.getName());
            product.setPrice(updatedProduct.getPrice());
            product.setCategory(updatedProduct.getCategory());
            return productRepository.save(product);
        }

        return null;
    }

    @DeleteMapping("products/{id}")
    public void deleteProduct(@PathVariable int id) {
        productRepository.deleteById(id);
    }
}
