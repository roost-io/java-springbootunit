package com.bootexample4.products.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Product_getId_ba349b1eff_Test {

    private Product product;

    @BeforeEach
    public void setUp() {
        product = new Product();
    }

    @Test
    public void testGetIdSuccess() {
        Long expectedId = 1L;
        product.setId(expectedId);
        Long actualId = product.getId();
        assertEquals(expectedId, actualId, "The expected ID does not match the actual ID");
    }

    @Test
    public void testGetIdFailure() {
        Long unexpectedId = 2L;
        product.setId(1L);
        Long actualId = product.getId();
        assertNotEquals(unexpectedId, actualId, "The unexpected ID should not match the actual ID");
    }
}
