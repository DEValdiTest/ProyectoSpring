package pe.edu.diego.proyectospring.infraestructura.inbound.handler;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import pe.edu.diego.proyectospring.aplication.facade.UsuarioFacade;
import pe.edu.diego.proyectospring.domain.model.AddUsuarioRequest;
import pe.edu.diego.proyectospring.domain.model.AddUsuarioResponse;
import pe.edu.diego.proyectospring.domain.model.Product;
import reactor.core.publisher.Mono;

@Component
public class UsuarioHandler {

    private final UsuarioFacade usuarioFacade;

    public UsuarioHandler(UsuarioFacade usuarioFacade){
        this.usuarioFacade = usuarioFacade;
    }

    public Mono<ServerResponse> addProduct(ServerRequest serverRequest) {
        return serverRequest
                .bodyToMono(AddUsuarioRequest.class)
                .flatMap(request -> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(usuarioFacade.addProduct(request), AddUsuarioRequest.class));

    }

    public Mono<ServerResponse> getProduct(ServerRequest serverRequest) {

        String userId = serverRequest.pathVariable("userId");

        return ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(usuarioFacade.getProduct(userId), Product.class);

    }

    public Mono<ServerResponse> deleteProduct(ServerRequest serverRequest) {
        return serverRequest
                .bodyToMono(AddUsuarioRequest.class)
                .flatMap(request -> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(usuarioFacade.deleteProduct(request), AddUsuarioRequest.class));

    }

    public Mono<ServerResponse> updateProduct(ServerRequest serverRequest) {
        return serverRequest
                .bodyToMono(AddUsuarioRequest.class)
                .flatMap(request -> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(usuarioFacade.updateProduct(request), AddUsuarioRequest.class));

    }

    public Mono<ServerResponse> testPost(ServerRequest serverRequest) {
        return serverRequest
                .bodyToMono(AddUsuarioRequest.class)
                .flatMap(request -> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(usuarioFacade.updateProduct(request), AddUsuarioRequest.class));

    }
}
