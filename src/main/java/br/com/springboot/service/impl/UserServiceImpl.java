package br.com.springboot.service.impl;

import br.com.springboot.model.User;
import br.com.springboot.repositories.UserRepository;
import br.com.springboot.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public List<User> findAllUsers() {
        return null;
    }

    @Override
    public User findUserById(Long id) {
        return null;
    }

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }
}
