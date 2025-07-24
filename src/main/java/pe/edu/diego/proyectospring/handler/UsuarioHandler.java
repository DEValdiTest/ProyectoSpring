package pe.edu.diego.proyectospring.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import pe.edu.diego.proyectospring.canonical.request.AddUsuarioRequest;
import pe.edu.diego.proyectospring.facade.UsuarioFacade;
import reactor.core.publisher.Mono;

import java.util.List;

@Component
public class UsuarioHandler {

    private final UsuarioFacade usuarioFacade;

    public UsuarioHandler(UsuarioFacade usuarioFacade){
        this.usuarioFacade = usuarioFacade;
    }

    public Mono<ServerResponse> addUserLegado(ServerRequest serverRequest) {
        return serverRequest
                .bodyToMono(AddUsuarioRequest.class)
                .flatMap(request -> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(usuarioFacade.addUserLegado(request), AddUsuarioRequest.class));

    }
}
