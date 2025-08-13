package pe.edu.diego.proyectospring.aplication.service;

public class EmailNotificationService implements NotificationService {

    @Override
    public void sendNotification(String message) {
        System.out.println("Se envia mensaje por email : " + message);
    }
}
