package com.wipro.sug.catalog.repository;

import com.wipro.sug.catalog.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
