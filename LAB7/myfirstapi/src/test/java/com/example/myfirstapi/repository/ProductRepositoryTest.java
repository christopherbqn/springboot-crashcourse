package com.example.myfirstapi.repository;

import com.example.myfirstapi.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.stream.Collectors;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {

    ProductRepository productRepository;

    @BeforeEach
    void setUpRepository(){
         productRepository = new ProductRepository();
    }

    // test find all products
    @Test
    void testFindAllProducts(){

        List<Product> products = productRepository.findAll();
        assertEquals(3,products.size());

        Set<String> productNames = products.stream()
                .map(Product::getName)
                .collect(Collectors.toSet());

        assertTrue(productNames.containsAll(Set.of("Laptop", "Mouse", "Keyboard")));
    }

    // test find existing ID
    @Test
    void testFindExistingProductId() {
        Long existingId = 1L;
        Optional<Product> foundProductOptional = productRepository.findById(existingId);

        assertTrue(foundProductOptional.isPresent());
        Product foundProduct = foundProductOptional.get();
        assertEquals(existingId, foundProduct.getId());
        assertEquals("Laptop", foundProduct.getName());
    }

    // test find Non-existing ID
    @Test
    void testFindNonExistingProductId(){
        Long nonExistingId = 1000L;
        Optional<Product> foundProduct = productRepository.findById(nonExistingId);
        assertTrue(foundProduct.isEmpty());
    }

    // test saving of products
    @Test
    void testSavingProducts(){

    }



}