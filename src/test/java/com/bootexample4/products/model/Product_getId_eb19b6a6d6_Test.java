package com.bootexample4.products.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

public class Product_getId_eb19b6a6d6_Test {

    @Mock
    private Product product;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetIdSuccess() {
        Long expectedId = 123L;
        when(product.getId()).thenReturn(expectedId);
        Long actualId = product.getId();
        assertEquals(expectedId, actualId, "The expected ID does not match the actual ID.");
    }

    @Test
    public void testGetIdNull() {
        when(product.getId()).thenReturn(null);
        Long actualId = product.getId();
        assertNull(actualId, "The ID should be null.");
    }
}
