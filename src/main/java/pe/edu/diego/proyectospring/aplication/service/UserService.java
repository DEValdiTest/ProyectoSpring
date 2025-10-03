package pe.edu.diego.proyectospring.aplication.service;

import pe.edu.diego.proyectospring.infraestructura.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    User save(User user);
}
