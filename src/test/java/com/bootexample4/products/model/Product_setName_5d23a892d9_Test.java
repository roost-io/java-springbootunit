// Test generated by RoostGPT for test endtoendunit using AI Type Open AI and AI Model gpt-4

package com.bootexample4.products.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class Product_setName_5d23a892d9_Test {

    private Product product;

    @BeforeEach
    public void setUp() {
        product = new Product();
    }

    @Test
    public void testSetName() {
        String expectedName = "Product1";
        product.setName(expectedName);
        Assertions.assertEquals(expectedName, product.getName());
    }

    @Test
    public void testSetName_Null() {
        String expectedName = null;
        product.setName(expectedName);
        Assertions.assertEquals(expectedName, product.getName());
    }

    @Test
    public void testSetName_Empty() {
        String expectedName = "";
        product.setName(expectedName);
        Assertions.assertEquals(expectedName, product.getName());
    }

    @Test
    public void testSetName_LongString() {
        // TODO: Change the string length according to your application's constraints
        String expectedName = "A".repeat(101);
        product.setName(expectedName);
        Assertions.assertEquals(expectedName, product.getName());
    }
}
