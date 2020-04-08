package com.wipro.sug.catalog.service;

import com.wipro.sug.catalog.entity.Product;
import com.wipro.sug.catalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public Product createProduct(Product product) {
        return saveProduct(product);
    }

    public Product updateProduct(Product product) {
        return saveProduct(product);
    }
}
