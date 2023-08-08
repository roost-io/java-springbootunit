@Test
public void testUpdateProductSuccess() {
    // Arrange
    long id = 1L;
    Product product = new Product();

    // Act
    ResponseEntity<Product> response = restTemplate.exchange(
            "/api/products/" + id,
            HttpMethod.PUT,
            product,
            Product.class
    );

    // Assert
    assertEquals(HttpStatus.OK, response.getStatusCode());
    assertNotNull(response.getBody());
    assertEquals("Updated Name", response.getBody().getName());
    assertEquals("Updated Description", response.getBody().getDescription());
    assertEquals(10.99, response.getBody().getPrice(), 0.01);
}

@Test
public void testUpdateProductNotFound() {
    // Arrange
    long id = 9999L;
    Product product = new Product();

    // Act
    ResponseEntity<Product> response = restTemplate.exchange(
            "/api/products/" + id,
            HttpMethod.PUT,
            product,
            Product.class
    );

    // Assert
    assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
    assertNull(response.getBody());
}
