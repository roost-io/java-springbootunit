// Test generated by RoostGPT for test endtoendunit using AI Type Open AI and AI Model gpt-4

package com.bootexample4.products.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class Product_setId_e7f341730a_Test {

    @InjectMocks
    private Product product;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSetIdSuccess() {
        Long expectedId = 123L;
        product.setId(expectedId);
        assertEquals(expectedId, product.getId());
    }

    @Test
    public void testSetIdNull() {
        product.setId(null);
        assertNull(product.getId());
    }
}
