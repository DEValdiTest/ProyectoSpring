package pe.edu.diego.proyectospring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;
import pe.edu.diego.proyectospring.controller.UserController;
import pe.edu.diego.proyectospring.entity.Client;

@WebFluxTest(UserController.class)
class ProyectoSpringApplicationTests {

    @Autowired
    private WebTestClient webTestClient;

    @Test
    public void testSaludo() {

        Client client = new Client();
        webTestClient.get()
                .uri("/api/user")
                .exchange()
                .expectStatus().isOk()
                .expectBody()
                .jsonPath("$.nombre").isEqualTo("Juan");
                //.isEqualTo(client);
    }

}
