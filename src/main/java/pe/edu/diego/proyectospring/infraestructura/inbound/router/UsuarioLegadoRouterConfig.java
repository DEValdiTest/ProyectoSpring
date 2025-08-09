package pe.edu.diego.proyectospring.infraestructura.inbound.router;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springdoc.core.annotations.RouterOperation;
import org.springdoc.core.annotations.RouterOperations;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import pe.edu.diego.proyectospring.domain.model.AddUsuarioRequest;
import pe.edu.diego.proyectospring.infraestructura.inbound.handler.UsuarioHandler;

import java.util.List;

import static org.springframework.web.reactive.function.server.RequestPredicates.PUT;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class UsuarioLegadoRouterConfig {

    @Bean
    @RouterOperations({
            @RouterOperation(
                    path = "/v1/addUserLegado",
                    operation = @Operation(
                            operationId = "routerAddUserLegado",
                            summary = "Agrega un usuario legado",
                            tags = {"CRUD Usurio Legado"},
                            requestBody = @RequestBody(required = true, description = "Enter Request body as Json Object",
                                    content = @Content(
                                            schema = @Schema(implementation = AddUsuarioRequest.class))),
                            responses = {
                                    @ApiResponse(responseCode = "200", description = "successful operation",
                                            content = @Content(schema = @Schema(implementation =  List.class))),
                                    @ApiResponse(responseCode = "400", description = "Invalid request"),
                                    @ApiResponse(responseCode = "500", description = "Internal error")
                            }
                    )
            ),

    })
    public RouterFunction<ServerResponse> routerAddUserLegado(UsuarioHandler handler) {
        return route(PUT("/v1/addUserLegado"), handler::addUserLegado);
    }
}
