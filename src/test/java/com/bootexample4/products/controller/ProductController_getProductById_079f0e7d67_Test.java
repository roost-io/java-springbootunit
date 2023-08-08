@Test
public void testGetProductByIdSuccessful() {
    Long id = 1L;
    ResponseEntity<Product> response = restTemplate.exchange(
            String.format("/products/%d", id),
            HttpMethod.GET,
            null,
            Product.class);
    assertThat(response).isNotNull();
    assertThat(response.getBody()).isNotNull();
    assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
}

@Test
public void testGetProductByIdNotFound() {
    Long id = 99999L;
    ResponseEntity<Product> response = restTemplate.exchange(
            String.format("/products/%d", id),
            HttpMethod.GET,
            null,
            Product.class);
    assertThat(response).isNotNull();
    assertThat(response.getBody()).isNull();
    assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
}
