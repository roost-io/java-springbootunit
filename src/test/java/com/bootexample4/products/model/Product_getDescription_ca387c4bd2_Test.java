@Test
public void testGetDescription_Success() {
    // Arrange
    Employee employee = new Employee(1L, "John Doe", "johndoe@example.com");
    employee.setDescription("A software engineer with 5 years of experience.");

    // Act
    String result = employee.getDescription();

    // Assert
    assertEquals("A software engineer with 5 years of experience.", result);
}

@Test
public void testGetDescription_Failure() {
    // Arrange
    Employee employee = new Employee(1L, "John Doe", "johndoe@example.com");

    // Act
    try {
        String result = employee.getDescription();
    } catch (IllegalStateException e) {
        // Assert
        assertEquals("Employee has no description.", e.getMessage());
    }
}
