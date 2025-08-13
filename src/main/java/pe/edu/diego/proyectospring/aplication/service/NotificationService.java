package pe.edu.diego.proyectospring.aplication.service;

import reactor.core.publisher.Mono;

public interface NotificationService {

    Mono<Void> sendNotification(String message);

}
