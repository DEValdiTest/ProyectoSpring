package pe.edu.diego.proyectospring.infraestructura.config.swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "ProyectoSpring",
                version = "1.0",
                description = "Api de pruebas para webflux",
                contact = @Contact(name = "Equipo Growth", email = "")
        ),
        servers = {
                @Server(description = "Entorno local", url = "http://localhost:8080/"),
                @Server(description = "Entorno QA IKF", url = "https://qas-ecommerce-fps-expc-ms-ecommerce-nearstdrugstore-ikf-ws.solucionesdigitalfps.com/")
        }
        /*,
        tags = {
                @Tag(name =  "ecommerce-domain.service-domain"),
                @Tag(name =  "Stock.RAD-RET"), }*/

)
public class SwaggerConfig {

}
