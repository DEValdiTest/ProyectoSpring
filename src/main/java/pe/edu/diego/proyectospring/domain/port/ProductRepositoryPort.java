package pe.edu.diego.proyectospring.domain.port;

import pe.edu.diego.proyectospring.domain.model.Product;
import reactor.core.publisher.Mono;

public interface ProductRepositoryPort {

    Mono<Product> findBySkuInkafarma(String skuInkafarma);

}
