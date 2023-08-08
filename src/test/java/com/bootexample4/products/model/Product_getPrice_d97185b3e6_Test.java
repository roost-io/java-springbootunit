@Test
public void testGetPriceSuccess() {
    // Arrange
    Product product = new Product();
    product.setPrice(10.99);
    // Act
    double result = product.getPrice();
    // Assert
    assertEquals(10.99, result, 0.01);
}

@Test
public void testGetPriceFailure() {
    // Arrange
    Product product = new Product();
    product.setPrice(-1.00);
    // Act
    double result = product.getPrice();
    // Assert
    assertEquals(-1.00, result, 0.01);
}
