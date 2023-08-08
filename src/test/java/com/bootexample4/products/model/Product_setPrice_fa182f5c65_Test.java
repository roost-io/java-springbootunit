@Test
public void testSetPriceSuccessful() {
    Product product = new Product();
    product.setPrice(10.99);
    assertEquals(10.99, product.getPrice());
}

@Test
public void testSetPriceFailure() {
    Product product = new Product();
    try {
        product.setPrice(-10.99);
        failBecauseNotReached();
    } catch (IllegalArgumentException e) {
        assertEquals("Price cannot be negative", e.getMessage());
    }
}
