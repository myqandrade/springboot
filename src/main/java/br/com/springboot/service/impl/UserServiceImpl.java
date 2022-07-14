package br.com.springboot.service.impl;

import br.com.springboot.model.User;
import br.com.springboot.model.UserDto;
import br.com.springboot.repositories.UserRepository;
import br.com.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {


    public UserDto userToUserDto(User user){
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        userDto.setUsername(user.getUsername());

        return userDto;
    }
    public User userDtoToUser(UserDto userDto){
        User user = new User();
        user.setId(userDto.getId());
        user.setName(userDto.getName());
        user.setUsername(userDto.getUsername());

        return user;
    }
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findById(Long id){
        return userRepository.findById(id);
    }

    @Override
    public User create(UserDto userDto) {
        User user = userDtoToUser(userDto);
        return userRepository.save(user);
    }

    @Override
    public void delete(Long id) {

    }
}
