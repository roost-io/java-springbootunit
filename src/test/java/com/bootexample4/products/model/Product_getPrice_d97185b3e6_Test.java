// Test generated by RoostGPT for test endtoendunit using AI Type Open AI and AI Model gpt-4

package com.bootexample4.products.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Product_getPrice_d97185b3e6_Test {

    private Product product;

    @BeforeEach
    public void setUp() {
        product = new Product();
    }

    @Test
    public void testGetPrice_WithPositiveValue() {
        double expectedPrice = 100.0;
        product.setPrice(expectedPrice); // TODO: Change the value to test with different positive numbers
        double actualPrice = product.getPrice();
        assertEquals(expectedPrice, actualPrice, "The expected price does not match the actual price");
    }

    @Test
    public void testGetPrice_WithZero() {
        double expectedPrice = 0.0;
        product.setPrice(expectedPrice); // TODO: Change the value to test with zero
        double actualPrice = product.getPrice();
        assertEquals(expectedPrice, actualPrice, "The expected price does not match the actual price");
    }

    @Test
    public void testGetPrice_WithNegativeValue() {
        double expectedPrice = -50.0;
        product.setPrice(expectedPrice); // TODO: Change the value to test with different negative numbers
        double actualPrice = product.getPrice();
        assertEquals(expectedPrice, actualPrice, "The expected price does not match the actual price");
    }
}