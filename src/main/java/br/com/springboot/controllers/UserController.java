package br.com.springboot.controllers;

import br.com.springboot.model.User;
import br.com.springboot.repositories.UserRepository;
import br.com.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String helloWorld(){
        return "Hello world";
    }

    @GetMapping
    public List<User> findAll(){
        return userService.findAllUsers();
    }

    @PostMapping
    public User create(@RequestBody User user){
        return userService.createUser(user);
    }
}
