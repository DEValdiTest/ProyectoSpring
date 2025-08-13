package pe.edu.diego.proyectospring.infraestructura.inbound.handler;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import pe.edu.diego.proyectospring.aplication.facade.UsuarioFacade;
import pe.edu.diego.proyectospring.domain.model.AddUsuarioRequest;
import pe.edu.diego.proyectospring.domain.model.NotificationRequest;
import reactor.core.publisher.Mono;

@Component
public class NotificationHandler {

    private final UsuarioFacade usuarioFacade;

    public NotificationHandler(UsuarioFacade usuarioFacade) {
        this.usuarioFacade = usuarioFacade;
    }

    public Mono<ServerResponse> sendMessage(ServerRequest serverRequest) {
        return serverRequest
                .bodyToMono(NotificationRequest.class)
                .flatMap(usuarioFacade::sendMessage)
                //.flatMap(request -> Mono.fromRunnable(() -> usuarioFacade.sendMessage(request)))
                .then(ServerResponse.ok().build());
    }
}
