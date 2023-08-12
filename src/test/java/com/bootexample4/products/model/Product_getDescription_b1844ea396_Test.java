// Test generated by RoostGPT for test endtoendunit using AI Type Open AI and AI Model gpt-4

package com.bootexample4.products.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Product_getDescription_b1844ea396_Test {

    @InjectMocks
    private Product product;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetDescription_Success() {
        String expectedDescription = "Test Product Description";
        product.setDescription(expectedDescription);
        String actualDescription = product.getDescription();
        assertEquals(expectedDescription, actualDescription, "Expected and actual descriptions should match");
    }

    @Test
    public void testGetDescription_Null() {
        product.setDescription(null);
        String actualDescription = product.getDescription();
        assertEquals(null, actualDescription, "Description should be null");
    }
}
