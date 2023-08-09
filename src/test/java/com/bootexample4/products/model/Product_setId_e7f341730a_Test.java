package com.bootexample4.products.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals; // added this import statement

public class Product_setId_e7f341730a_Test {

    @Mock
    private Product product;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSetIdSuccess() {
        Long expectedId = 100L;
        product.setId(expectedId);
        assertEquals(expectedId, product.getId(), "The expected ID does not match the actual ID");
    }

    @Test
    public void testSetIdFailure() {
        Long unexpectedId = 200L;
        product.setId(100L);
        assertNotEquals(unexpectedId, product.getId(), "The unexpected ID matches the actual ID");
    }
}
