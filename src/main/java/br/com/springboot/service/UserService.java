package br.com.springboot.service;

import br.com.springboot.model.User;
import br.com.springboot.model.UserDto;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> findAll();

    Optional<User> findById(Long id);

    User create(UserDto userDto);

    void delete(Long id);

}
