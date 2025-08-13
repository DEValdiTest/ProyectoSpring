package pe.edu.diego.proyectospring.infraestructura.inbound.router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import pe.edu.diego.proyectospring.infraestructura.inbound.handler.NotificationHandler;
import pe.edu.diego.proyectospring.infraestructura.inbound.handler.UsuarioHandler;

import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class NotificationRouter {

    @Bean
    public RouterFunction<ServerResponse> routerNotification(NotificationHandler notificationHandler) {
        return route(POST("/notification"), notificationHandler::sendMessage);
    }
}
