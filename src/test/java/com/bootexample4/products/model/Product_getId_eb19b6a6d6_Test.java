@Test
public void testGetId_Success() {
    Long expectedId = 1L;
    Entity entity = new Entity(1, "name", "description");
    when(entityRepository.findById(anyLong())).thenReturn(Optional.of(entity));
    assertEquals(expectedId, entityService.getId());
}

@Test
public void testGetId_Failure() {
    Long expectedId = null;
    when(entityRepository.findById(anyLong())).thenReturn(Optional.empty());
    assertNull(entityService.getId());
}
