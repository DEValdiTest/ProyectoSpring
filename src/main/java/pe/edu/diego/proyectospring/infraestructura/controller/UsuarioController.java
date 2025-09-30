package pe.edu.diego.proyectospring.infraestructura.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.diego.proyectospring.domain.entity.Usuario;

@RestController
public class UsuarioController {

    @GetMapping("/obtenerUsuario")
    public Usuario obtenerUsuario() {
        Usuario usuario = new Usuario();
        usuario.setId(1);
        usuario.setNombre("Usuario 12");

        return usuario;
    }
}
