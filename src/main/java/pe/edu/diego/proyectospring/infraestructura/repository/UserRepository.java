package pe.edu.diego.proyectospring.infraestructura.repository;

import org.springframework.data.repository.CrudRepository;
import pe.edu.diego.proyectospring.infraestructura.entity.User;

public interface UserRepository extends CrudRepository<User, Long>   {
}
