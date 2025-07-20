package com.example.myfirstapi.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    private Product product;

    @BeforeEach // create a product with productId for each test
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

    @Test
    void testConstructorWithoutId() {
        Product newProduct = new Product("Milk", 5.99);
        assertNull(newProduct.getId());
        assertEquals("Milk", newProduct.getName());
        assertEquals(5.99, newProduct.getPrice());
    }

    @Test
    void testProductEqualsForSameProducts(){
        Product sameProduct = new Product(1000L, "Cheese", 100.0);
        assertTrue(product.equals(sameProduct));
    }

    @Test
    void testProductEqualsInvalid(){
        Product differentProduct = new Product(1550L, "Bread", 59.95);
        assertFalse(product.equals(differentProduct));
    }

    @Test
    void testHashCodeForEqualObjects(){
        Product sameProduct = new Product(1000L, "Cheese", 100.0);
        assertEquals(product.hashCode(), sameProduct.hashCode());
    }

    @Test
    void testHashCodeForDifferentObjects() {
        Product differentProduct = new Product(1001L, "Butter", 120.0);
        assertNotEquals(product.hashCode(), differentProduct.hashCode());
    }

    @Test
    void testToString() {
        String productString = product.toString();
        assertTrue(productString.contains("id=1000"));
        assertTrue(productString.contains("name='Cheese'"));
        assertTrue(productString.contains("price=100.0"));
    }








}
