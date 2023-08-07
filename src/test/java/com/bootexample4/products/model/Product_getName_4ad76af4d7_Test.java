// Test generated by RoostGPT for test endtoendunit using AI Type Open AI and AI Model gpt-4

package com.bootexample4.products.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Product_getName_4ad76af4d7_Test {

    private Product product;

    @BeforeEach
    public void setup() {
        product = new Product();
    }

    @Test
    public void testGetName_Success() {
        String expectedName = "Product A";
        product.setName(expectedName);
        String actualName = product.getName();
        assertEquals(expectedName, actualName, "The expected name does not match the actual name.");
    }

    @Test
    public void testGetName_Null() {
        String expectedName = null;
        product.setName(expectedName);
        String actualName = product.getName();
        assertEquals(expectedName, actualName, "The expected name does not match the actual name.");
    }
}
