package pe.pruebas.proyectospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.pruebas.proyectospring.model.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByName(String name);  // Consulta personalizada por nombre
}
