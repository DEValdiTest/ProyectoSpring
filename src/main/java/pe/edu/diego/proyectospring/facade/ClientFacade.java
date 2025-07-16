package pe.edu.diego.proyectospring.facade;

import org.springframework.stereotype.Service;
import pe.edu.diego.proyectospring.entity.Client;
import pe.edu.diego.proyectospring.repository.ClientRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClientFacade {

    ClientRepository clientRepository;

    public ClientFacade(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

    public Flux<Client> getUser() {
        /*Client client = new Client();
        client.setCia("95");*/
        return clientRepository.findByIdClient("0000000041")
                .map(x->{
                    Client cl=new Client();
                    cl.setIdClient(x.getIdClient());
                    cl.setIdentityDocumentNumber(x.getIdentityDocumentNumber());
                    cl.setDescriptionClient("Diego prueba");
                    return cl;

                });

    }
}
