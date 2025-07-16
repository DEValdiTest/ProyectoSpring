package pe.edu.diego.proyectospring.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import pe.edu.diego.proyectospring.entity.Client;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClientRepository extends ReactiveMongoRepository<Client, String> {

    Flux<Client> findByIdClient(String clientName);
}
