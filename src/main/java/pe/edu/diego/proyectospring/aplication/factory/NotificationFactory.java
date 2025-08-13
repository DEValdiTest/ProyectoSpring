package pe.edu.diego.proyectospring.aplication.factory;

import org.springframework.stereotype.Component;
import pe.edu.diego.proyectospring.aplication.service.EmailNotificationService;
import pe.edu.diego.proyectospring.aplication.service.NotificationService;
import pe.edu.diego.proyectospring.aplication.service.SmsNotificationService;

@Component
public class NotificationFactory {

    public NotificationService getNotificationService(String type){
        return switch(type.toUpperCase()){
            case "EMAIL" -> new EmailNotificationService();
            case "SMS" -> new SmsNotificationService();
            default -> throw new IllegalArgumentException("Tipo no soportado: " + type);
        };

    }
}
