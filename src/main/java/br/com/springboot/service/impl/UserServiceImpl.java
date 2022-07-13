package br.com.springboot.service.impl;

import br.com.springboot.model.User;
import br.com.springboot.model.UserDto;
import br.com.springboot.repositories.UserRepository;
import br.com.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User findUserById(Long id) {
        return null;
    }

    @Override
    public User createUser(UserDto userDto) {
        User user = userDtoToUser(userDto);
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {

    }
}
