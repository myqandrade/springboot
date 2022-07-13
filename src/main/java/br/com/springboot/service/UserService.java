package br.com.springboot.service;

import br.com.springboot.model.User;
import br.com.springboot.model.UserDto;

import java.util.List;

public interface UserService {

    List<User> findAllUsers();

    User findUserById(Long id);

    User createUser(UserDto userDto);

    void deleteUser(Long id);

}
