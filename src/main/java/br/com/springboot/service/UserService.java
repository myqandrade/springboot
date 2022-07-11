package br.com.springboot.service;

import br.com.springboot.model.User;

import java.util.List;

public interface UserService {

    List<User> findAllUsers();

    User findUserById(Long id);

    User createUser(User user);

    void deleteUser(Long id);

}
