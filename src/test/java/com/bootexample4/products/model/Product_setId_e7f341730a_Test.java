@Test
public void testSetIdSuccessful() {
    Employee employee = new Employee();
    Long id = 1L;
    employee.setId(id);
    assertEquals(id, employee.getId());
}

@Test
public void testSetIdFailure() {
    Employee employee = new Employee();
    try {
        employee.setId(null);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
        assertEquals("Invalid id", e.getMessage());
    }
}
