// Test generated by RoostGPT for test endtoendunit using AI Type Open AI and AI Model gpt-4

package com.bootexample4.products.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import com.bootexample4.products.model.Product;
import com.bootexample4.products.repository.ProductRepository;

@SpringBootTest
public class ProductController_getProductById_079f0e7d67_Test {

    @InjectMocks
    private ProductController productController;

    @Mock
    private ProductRepository productRepository;

    @Test
    public void testGetProductById_Found() {
        Long id = 1L; // TODO: Change the product id as per your test data
        Product product = new Product();
        product.setId(id);
        product.setName("Test Product");

        when(productRepository.findById(id)).thenReturn(Optional.of(product));

        ResponseEntity<Product> responseEntity = productController.getProductById(id);

        assertEquals(200, responseEntity.getStatusCodeValue());
        assertEquals(product, responseEntity.getBody());
    }

    @Test
    public void testGetProductById_NotFound() {
        Long id = 1L; // TODO: Change the product id as per your test data

        when(productRepository.findById(id)).thenReturn(Optional.empty());

        ResponseEntity<Product> responseEntity = productController.getProductById(id);

        assertEquals(404, responseEntity.getStatusCodeValue());
    }
}
