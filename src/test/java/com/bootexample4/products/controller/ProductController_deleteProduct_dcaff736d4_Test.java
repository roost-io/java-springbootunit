// Test generated by RoostGPT for test endtoendunit using AI Type Open AI and AI Model gpt-4

package com.bootexample4.products.controller;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import com.bootexample4.products.model.Product;
import com.bootexample4.products.repository.ProductRepository;

public class ProductController_deleteProduct_dcaff736d4_Test {

    @InjectMocks
    private ProductController productController;

    @Mock
    private ProductRepository productRepository;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testDeleteProduct_Success() {
        Product product = new Product();
        product.setId(1L);

        when(productRepository.findById(any(Long.class))).thenReturn(Optional.of(product));
        doNothing().when(productRepository).delete(product);

        ResponseEntity<Object> responseEntity = productController.deleteProduct(1L);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }

    @Test
    public void testDeleteProduct_NotFound() {
        when(productRepository.findById(any(Long.class))).thenReturn(Optional.empty());

        ResponseEntity<Object> responseEntity = productController.deleteProduct(1L);

        assertEquals(404, responseEntity.getStatusCodeValue());
    }
}
