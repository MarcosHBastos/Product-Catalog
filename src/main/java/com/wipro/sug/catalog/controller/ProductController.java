package com.wipro.sug.catalog.controller;

import com.wipro.sug.catalog.entity.Product;
import com.wipro.sug.catalog.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public void createProduct(@RequestBody Product newProduct) {
        productService.createProduct(newProduct);
    }
}
