package com.example.myfirstapi.controller;

import com.example.myfirstapi.model.Product;
import com.example.myfirstapi.repository.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController // This annotation makes it a REST controller
public class ProductController {

    private final ProductRepository productRepository; // Declare the dependency

    // Constructor Injection: Spring will automatically provide ProductRepository here
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/products") // Maps HTTP GET requests to /products
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }






}
