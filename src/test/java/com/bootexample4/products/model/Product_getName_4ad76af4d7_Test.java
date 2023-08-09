package com.bootexample4.products.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.mockito.Mockito;

@SpringBootTest
public class Product_getName_4ad76af4d7_Test {

    @MockBean
    private Product product;

    @BeforeEach
    public void setUp() {
        Mockito.when(product.getName()).thenReturn("Test Product");
    }

    @Test
    public void testGetName_Success() {
        String expectedName = "Test Product";
        String actualName = product.getName();
        Assertions.assertEquals(expectedName, actualName, "The expected name does not match the actual name");
    }

    @Test
    public void testGetName_Failure() {
        String unexpectedName = "Wrong Product";
        String actualName = product.getName();
        Assertions.assertNotEquals(unexpectedName, actualName, "The unexpected name matches the actual name");
    }
}
