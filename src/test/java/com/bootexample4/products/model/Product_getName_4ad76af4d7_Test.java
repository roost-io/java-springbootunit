// Test generated by RoostGPT for test endtoendunit using AI Type Open AI and AI Model gpt-4

package com.bootexample4.products.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Product_getName_4ad76af4d7_Test {

    @InjectMocks
    private Product product;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetName() {
        String expectedName = "TestProduct";
        product.setName(expectedName);
        String actualName = product.getName();
        assertEquals(expectedName, actualName, "Expected name doesn't match with actual name");
    }

    @Test
    public void testGetNameWithNull() {
        String expectedName = null;
        product.setName(expectedName);
        String actualName = product.getName();
        assertEquals(expectedName, actualName, "Expected name doesn't match with actual name");
    }
}