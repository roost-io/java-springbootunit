package com.bootexample4.products.controller;

import com.bootexample4.products.model.Product;
import com.bootexample4.products.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ProductController_createProduct_5fee6d5a95_Test {

    @InjectMocks
    private ProductController productController;

    @Mock
    private ProductRepository productRepository;

    @Test
    public void testCreateProductSuccess() {
        Product product = new Product();
        product.setId(1L);
        product.setName("Test Product");
        product.setDescription("Test Description");
        product.setPrice(100.0);

        when(productRepository.save(product)).thenReturn(product);

        Product result = productController.createProduct(product);

        assertEquals(product, result);
    }

    @Test
    public void testCreateProductFailure() {
        Product product = new Product();
        product.setId(1L);
        product.setName("Test Product");
        product.setDescription("Test Description");
        product.setPrice(100.0);

        when(productRepository.save(product)).thenReturn(null);

        Product result = productController.createProduct(product);

        assertEquals(null, result);
    }
}
