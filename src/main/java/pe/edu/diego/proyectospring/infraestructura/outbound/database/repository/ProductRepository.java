package pe.edu.diego.proyectospring.infraestructura.outbound.database.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import pe.edu.diego.proyectospring.infraestructura.outbound.database.collection.ProductRepo;
import reactor.core.publisher.Mono;

@Repository
public interface ProductRepository extends ReactiveMongoRepository<ProductRepo, String> {

    Mono<ProductRepo> findBySkuInkafarma(String skuInkafarma);

}
