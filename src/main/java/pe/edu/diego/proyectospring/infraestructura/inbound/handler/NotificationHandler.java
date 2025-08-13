package pe.edu.diego.proyectospring.infraestructura.inbound.handler;

import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

public class NotificationHandler {

    public Mono<ServerResponse> sendMessage(ServerRequest request) {
        return null;
    }
}
