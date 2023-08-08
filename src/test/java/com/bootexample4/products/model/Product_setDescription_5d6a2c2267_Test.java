@Test
public void testSetDescriptionSuccess() {
    Employee employee = new Employee();
    employee.setDescription("A software developer");
    assertEquals("A software developer", employee.getDescription());
}

@Test
public void testSetDescriptionFailureNullInput() {
    Employee employee = new Employee();
    assertThrows(IllegalArgumentException.class, () -> employee.setDescription(null));
    assertEquals("", employee.getDescription());
}
