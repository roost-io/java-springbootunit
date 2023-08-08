import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebFlux;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import reactor.core.publisher.Mono;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureWebFlux
public class ProductControllerTest {

    @Autowired
    private ProductRepository productRepository;

    private RestTemplate restTemplate;

    @Before
    public void setup() {
        this.restTemplate = new MockRestTemplate();
    }

    @Test
    public void testGetAllProductsSuccessful() {
        // Arrange
        List<Product> expectedResults = new ArrayList<>();
        expectedResults.add(new Product("Product 1", 10));
        expectedResults.add(new Product("Product 2", 20));
        when(productRepository.findAll()).thenReturn(expectedResults);

        // Act
        Mono<ResponseEntity<List<Product>> response = restTemplate.exchange("/api/products", HttpMethod.GET, null, List.class);

        // Assert
        assertEquals(HttpStatus.OK, response.statusCode());
        assertEquals(expectedResults, response.body());
    }

    @Test
    public void testGetAllProductsFailed() {
        // Arrange
        when(productRepository.findAll()).thenThrow(new RuntimeException("Mock database exception"));

        // Act
        Mono<ResponseEntity<List<Product>> response = restTemplate.exchange("/api/products", HttpMethod.GET, null, List.class);

        // Assert
        assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, response.statusCode());
        assertNull(response.body());
    }
}
