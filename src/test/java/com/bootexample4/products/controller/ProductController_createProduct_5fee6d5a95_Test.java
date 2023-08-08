import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.web.reactive.function.bodyToMono;

public class ProductControllerTest {

    private WebTestClient.Builder testClientBuilder;

    @Autowired
    public ProductControllerTest(WebTestClient.Builder testClientBuilder) {
        this.testClientBuilder = testClientBuilder;
    }

    @Before
    public void setup() {
        testClientBuilder.apply(this::configureMockMvc);
    }

    private void configureMockMvc(WebTestClient.Builder builder) {
        builder.mockMvc(new MockMvc(new WebApplicationContext()));
    }

    @Test
    public void testCreateProductSuccessful() {
        // Arrange
        Product product = new Product();
        product.setName("Test Product");
        product.setDescription("This is a test product.");
        product.setPrice(19.99);

        // Act
        ResponseEntity<Product> response = testClientBuilder.post()
               .contentType(MediaType.APPLICATION_JSON)
               .body(bodyToMono(product))
               .uri("/api/products")
               .exchange();

        // Assert
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());
        assertEquals(product.getName(), response.getBody().getName());
    }

    @Test
    public void testCreateProductFailed() {
        // Arrange
        Product product = new Product();
        product.setName("Invalid Name");
        product.setDescription("This is a test product.");
        product.setPrice(19.99);

        // Act
        ResponseEntity<Product> response = testClientBuilder.post()
               .contentType(MediaType.APPLICATION_JSON)
               .body(bodyToMono(product))
               .uri("/api/products")
               .exchange();

        // Assert
        assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());
        assertNotNull(response.getBody());
        assertTrue(response.getBody().getMessage().contains("Invalid name"));
    }
}
