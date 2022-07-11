package br.com.springboot.controllers;

import br.com.springboot.repositories.UserRepository;
import br.com.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    @GetMapping("/")
    public String helloWorld(){
        return "Hello world";
    }
}
