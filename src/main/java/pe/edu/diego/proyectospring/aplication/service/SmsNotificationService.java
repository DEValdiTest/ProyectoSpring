package pe.edu.diego.proyectospring.aplication.service;

public class SmsNotificationService implements NotificationService {

    public void sendNotification(String message){
        System.out.println("Se envia mensaje por sms : " + message);
    }

}
