package pe.edu.diego.proyectospring.aplication.facade;

import org.springframework.stereotype.Service;
import pe.edu.diego.proyectospring.domain.model.AddUsuarioRequest;
import pe.edu.diego.proyectospring.domain.model.AddUsuarioResponse;
import pe.edu.diego.proyectospring.domain.model.Product;
import pe.edu.diego.proyectospring.domain.port.ProductRepositoryPort;
import reactor.core.publisher.Mono;

@Service
public class UsuarioFacade {

    private final ProductRepositoryPort productRepositoryPort;

    public UsuarioFacade(ProductRepositoryPort productRepositoryPort) {
        this.productRepositoryPort = productRepositoryPort;
    }

    public Mono<AddUsuarioRequest> addProduct(AddUsuarioRequest request){
        request.setUserId(request.getUserId()+" Add");
        return Mono.just(request);

    }

    public Mono<Product> getProduct(String userid){

       /* AddUsuarioResponse response = new AddUsuarioResponse();
        response.setRespuesta(userid+" Get");*/
        System.out.println("goku : " + userid);
        return productRepositoryPort.findBySkuInka:farma(userid);

    }

    public Mono<AddUsuarioRequest> deleteProduct(AddUsuarioRequest request){
        request.setUserId(request.getUserId()+" Delete");
        return Mono.just(request);

    }

    public Mono<AddUsuarioRequest> updateProduct(AddUsuarioRequest request){
        request.setUserId(request.getUserId()+" Update");
        return Mono.just(request);

    }
}
