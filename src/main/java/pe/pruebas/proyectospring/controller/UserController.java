package pe.pruebas.proyectospring.controller;


import org.springframework.web.bind.annotation.*;
import pe.pruebas.proyectospring.model.User;
import pe.pruebas.proyectospring.repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return repository.save(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @GetMapping("/search")
    public List<User> getUsersByName(@RequestParam String name) {
        return repository.findByName(name);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
