package pe.edu.diego.proyectospring.infraestructura.inbound.router;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
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

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;
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
            @RouterOperation(
                    path = "/v1/userLegado2/{userId}",
                    beanMethod = "getProduct",
                    beanClass = UsuarioHandler.class,
                    method = GET,
                    produces = { "application/json" },
                    operation = @Operation(
                            parameters = {
                                    @Parameter(
                                            in = ParameterIn.PATH,
                                            name = "userId",
                                            description = "Nombre de la persona a saludar",
                                            required = true
                                    ),

                            },
                            operationId = "routerAddUserLegado",
                            summary = "Obtiene un usuario legado",
                            tags = {"CRUD Usurio Legado"},
/*
                            requestBody = @RequestBody(required = true, description = "Enter Request body as Json Object",
                                    content = @Content(
                                            schema = @Schema(implementation = AddUsuarioRequest.class))),*/
                            responses = {
                                    @ApiResponse(responseCode = "200", description = "successful operation",
                                            content = @Content(schema = @Schema(implementation =  List.class))),
                                    @ApiResponse(responseCode = "400", description = "Invalid request"),
                                    @ApiResponse(responseCode = "500", description = "Internal error")
                            }
                    )
            ),
            @RouterOperation(
                    path = "/v1/addUserLegado3",
                    beanMethod = "updateProduct",
                    beanClass = UsuarioHandler.class,
                    method = org.springframework.web.bind.annotation.RequestMethod.POST,//esto es importante
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
            @RouterOperation(
                    path = "/v1/userLegado4",
                    method = org.springframework.web.bind.annotation.RequestMethod.DELETE,//esto es importante
                    operation = @Operation(
                            operationId = "routerAddUserLegado",
                            summary = "Elimina un usuario legado",
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
            @RouterOperation(
                    path = "/v1/userLegado5",
                   /* beanMethod = "updateProduct",
                    beanClass = UsuarioHandler.class,*/
                    method = org.springframework.web.bind.annotation.RequestMethod.POST,//esto es importante
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
        return route(PUT("/v1/addUserLegado"), handler::addProduct)
                .andRoute(GET("/v1/userLegado2/{userId}"), handler::getProduct)
                .andRoute(POST("/v1/userLegado3"),handler::updateProduct)
                .andRoute(DELETE("/v1/userLegado4"),handler::deleteProduct)
                .andRoute(POST("/v1/userLegado5"),handler::testPost);

    }
}
