package com.dev2prod.product.service;

import com.dev2prod.product.entity.Product;
import com.dev2prod.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    public List<Product> addProducts(List<Product> productList) {
        return productRepository.saveAll(productList);
    }

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public List<Product> getProductsByIds(List<Long> productIdsList) {
        return productRepository.findAllById(productIdsList);
    }
}
