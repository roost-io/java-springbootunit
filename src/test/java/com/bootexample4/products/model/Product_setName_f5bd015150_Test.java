@Test
public void testSetNameSuccess() {
    Employee employee = new Employee();
    employee.setName("John Doe");
    assertEquals("John Doe", employee.getName());
}

@Test
public void testSetNameFailure() {
    Employee employee = new Employee();
    try {
        employee.setName(null);
        fail();
    } catch (IllegalArgumentException e) {
        assertEquals(" Cannot set null value for 'name'", e.getMessage());
    }
    assertNull(employee.getName());
}
