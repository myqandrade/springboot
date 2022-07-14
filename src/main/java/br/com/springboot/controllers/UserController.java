package br.com.springboot.controllers;

import br.com.springboot.model.User;
import br.com.springboot.model.UserDto;
import br.com.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> users = userService.findAll();
        return ResponseEntity.ok(users);
    }

    @GetMapping("{id}")
    public ResponseEntity<Optional<User>> findById(@PathVariable("id") Long id){
        return ResponseEntity.ok(userService.findById(id));
    }

    @PostMapping
    public ResponseEntity<User> create(@RequestBody UserDto userDto){
        return ResponseEntity.ok(userService.create(userDto));
    }
}
