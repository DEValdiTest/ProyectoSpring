package pe.edu.diego.proyectospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.diego.proyectospring.entity.Client;
import pe.edu.diego.proyectospring.facade.ClientFacade;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/user")
public class UserController {

    ClientFacade clientFacade;

    public UserController(ClientFacade clientFacade){
        this.clientFacade=clientFacade;
    }

    @GetMapping
    public Flux<Client> getUser() {
        return clientFacade.getUser();

    }
}
