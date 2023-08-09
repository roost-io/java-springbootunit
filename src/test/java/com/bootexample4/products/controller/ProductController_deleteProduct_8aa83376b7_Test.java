package com.bootexample4.products.controller;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.verify;
import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

import com.bootexample4.products.model.Product;
import com.bootexample4.products.repository.ProductRepository;

@RunWith(MockitoJUnitRunner.class)
public class ProductController_deleteProduct_8aa83376b7_Test {
    
    @InjectMocks
    private ProductController productController;
    
    @Mock
    private ProductRepository productRepository;
    
    private Product product;
    
    @Before
    public void setup() {
        product = new Product();
        product.setId(1L);
    }
    
    @Test
    public void testDeleteProductSuccess() {
        when(productRepository.findById(any(Long.class))).thenReturn(Optional.of(product));
        
        ResponseEntity<Object> responseEntity = productController.deleteProduct(1L);
        
        verify(productRepository).deleteById(any(Long.class));
        assertEquals(200, responseEntity.getStatusCodeValue());
    }
    
    @Test
    public void testDeleteProductNotFound() {
        when(productRepository.findById(any(Long.class))).thenReturn(Optional.empty());
        
        ResponseEntity<Object> responseEntity = productController.deleteProduct(1L);
        
        assertEquals(404, responseEntity.getStatusCodeValue());
    }
}
