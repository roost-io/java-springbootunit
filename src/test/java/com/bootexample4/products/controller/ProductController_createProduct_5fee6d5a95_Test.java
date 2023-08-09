package com.bootexample4.products.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.bootexample4.products.model.Product;
import com.bootexample4.products.repository.ProductRepository;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class ProductController_createProduct_5fee6d5a95_Test {

    @InjectMocks
    private ProductController productController;

    @Mock
    private ProductRepository productRepository;

    private Product product;

    @BeforeEach
    public void setup() {
        product = new Product();
        product.setId(1L); // Changed from 1 to 1L
        product.setName("Test Product");
        product.setDescription("Test Product Description");
        product.setPrice(100.0);
    }

    @Test
    public void testCreateProduct_Success() {
        when(productRepository.save(any(Product.class))).thenReturn(product);

        Product createdProduct = productController.createProduct(product);

        assertNotNull(createdProduct);
        assertEquals(product.getId(), createdProduct.getId());
        assertEquals(product.getName(), createdProduct.getName());
        assertEquals(product.getDescription(), createdProduct.getDescription());
        assertEquals(product.getPrice(), createdProduct.getPrice());
    }

    @Test
    public void testCreateProduct_Failure() {
        when(productRepository.save(any(Product.class))).thenReturn(null);

        Product createdProduct = productController.createProduct(product);

        assertNull(createdProduct);
    }
}
