package pe.edu.diego.proyectospring.facade;

import org.springframework.stereotype.Service;
import pe.edu.diego.proyectospring.canonical.request.AddUsuarioRequest;
import reactor.core.publisher.Mono;

@Service
public class UsuarioFacade {

    public Mono<AddUsuarioRequest> addUserLegado(AddUsuarioRequest request){
        request.setUserId(request.getUserId()+" 1");
        return Mono.just(request);

    }
}
