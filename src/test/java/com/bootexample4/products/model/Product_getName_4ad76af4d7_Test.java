@Test
public void testGetName_Success() {
    Employee employee = new Employee(1L);
    assertEquals("John Doe", employee.getName());
}

@Test
public void testGetName_Failure() {
    Employee employee = new Employee(1L, null);
    assertNull(employee.getName());
}
