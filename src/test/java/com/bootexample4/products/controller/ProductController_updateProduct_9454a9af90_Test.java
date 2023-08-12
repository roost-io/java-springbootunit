package com.bootexample4.products.controller;

import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyLong;

import com.bootexample4.products.model.Product;
import com.bootexample4.products.repository.ProductRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@SpringBootTest
public class ProductController_updateProduct_9454a9af90_Test {

    @Autowired
    private ProductController productController;

    @MockBean
    private ProductRepository productRepository;

    private Product existingProduct;

    @BeforeEach
    public void setup() {
        existingProduct = new Product();
        existingProduct.setId(1L);
        existingProduct.setName("Test Product");
        existingProduct.setDescription("Test Description");
        existingProduct.setPrice(100.00);
    }

    @Test
    public void testUpdateProduct_Success() {
        Product newProduct = new Product();
        newProduct.setName("Updated Product");
        newProduct.setDescription("Updated Description");
        newProduct.setPrice(200.00);

        when(productRepository.findById(anyLong())).thenReturn(Optional.of(existingProduct));
        when(productRepository.save(any(Product.class))).thenReturn(newProduct);

        ResponseEntity<Product> response = productController.updateProduct(1L, newProduct);

        assertEquals(200, response.getStatusCodeValue());
        assertEquals(newProduct, response.getBody());
    }

    @Test
    public void testUpdateProduct_NotFound() {
        Product newProduct = new Product();
        newProduct.setName("Updated Product");
        newProduct.setDescription("Updated Description");
        newProduct.setPrice(200.00);

        when(productRepository.findById(anyLong())).thenReturn(Optional.empty());

        ResponseEntity<Product> response = productController.updateProduct(1L, newProduct);

        assertEquals(404, response.getStatusCodeValue());
    }
}
