package com.bootexample4.products.controller;

import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import com.bootexample4.products.model.Product;
import com.bootexample4.products.repository.ProductRepository;

public class ProductController_createProduct_5fee6d5a95_Test {

    @InjectMocks
    ProductController productController;

    @Mock
    ProductRepository productRepository;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCreateProduct() {

        Product product = new Product();
        product.setId(1L); // Changed from int to Long
        product.setName("Test Product");
        product.setDescription("Test Description");
        product.setPrice(100.0);

        when(productRepository.save(product)).thenReturn(product);

        Product result = productController.createProduct(product);

        assertEquals(product, result);
    }

    @Test
    public void testCreateProductWithNull() {
        Product product = null;
        when(productRepository.save(product)).thenReturn(product);

        Product result = productController.createProduct(product);

        assertEquals(product, result);
    }
}
