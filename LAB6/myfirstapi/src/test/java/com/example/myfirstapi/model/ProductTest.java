package com.example.myfirstapi.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    private Product product;

    @BeforeEach
    void setProductsWithID(){
        product = new Product(1000L,"Cheese",100);
    }

    @Test
    void testGetId(){
        long resultId = product.getId();
        assertEquals(1000L, resultId);
    }

    @Test
    void testGetName(){
        String resultName = product.getName();
        assertEquals("Cheese", resultName);
    }

    @Test
    void testGetPrice(){
        double resultPrice = product.getPrice();
        assertEquals(100,  resultPrice);
    }

    @Test
    void testSetId(){
        product.setId(120L);
        assertEquals(120L, product.getId());
    }

    @Test
    void testSetName(){
        product.setName("Cream Cheese");
        assertEquals("Cream Cheese", product.getName() );
    }

    @Test
    void testSetPrice(){
        product.setPrice(154.95);
        assertEquals(154.95, product.getPrice());
    }



}
