package pe.edu.diego.proyectospring.domain.model;

import lombok.Data;

@Data
public class NotificationRequest {

    private String type;
    private String message;

}
