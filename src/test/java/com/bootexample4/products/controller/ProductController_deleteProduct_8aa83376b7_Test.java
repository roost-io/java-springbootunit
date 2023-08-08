@Test
public void testDeleteSuccessfulProduct() {
    Long id = 1L;
    ResponseEntity<Object> response = restTemplate.deleteProduct(id);
    assertEquals(HttpStatus.OK, response.getStatusCode());
}

@Test
public void testDeleteNonExistentProduct() {
    Long id = 9999L;
    ResponseEntity<Object> response = restTemplate.deleteProduct(id);
    assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
}
