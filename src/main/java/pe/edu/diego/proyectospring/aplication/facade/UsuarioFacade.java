package pe.edu.diego.proyectospring.aplication.facade;

import org.springframework.stereotype.Service;
import pe.edu.diego.proyectospring.domain.model.AddUsuarioRequest;
import reactor.core.publisher.Mono;

@Service
public class UsuarioFacade {

    public Mono<AddUsuarioRequest> addUserLegado(AddUsuarioRequest request){
        request.setUserId(request.getUserId()+" 1");
        return Mono.just(request);

    }
}
