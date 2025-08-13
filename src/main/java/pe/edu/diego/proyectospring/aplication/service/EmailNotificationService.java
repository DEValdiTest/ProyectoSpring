package pe.edu.diego.proyectospring.aplication.service;

import reactor.core.publisher.Mono;

public class EmailNotificationService implements NotificationService {

    @Override
    public Mono<Void> sendNotification(String message) {
        return Mono.fromRunnable(() -> {System.out.println("Se envia mensaje por email : " + message);});

    }
}
