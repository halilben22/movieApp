package com.halilben22.userservice.service;

import com.halilben22.userservice.dto.UserDto;
import com.halilben22.userservice.model.User;
import com.halilben22.userservice.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public User createUser(UserDto user) {

        User createdUser;

        createdUser = userRepository.findOneByUsername(user.getUsername());
        if (createdUser != null) {

            return null;
        }
        createdUser = new User();
        createdUser.setFirstName(user.getFirstName());
        createdUser.setLastName(user.getLastName());
        createdUser.setUsername(user.getUsername());
        createdUser.setPassword(user.getPassword());
        createdUser.setComments(user.getComments());
        createdUser.setReplies(user.getReplies());
        return userRepository.save(createdUser);
    }

    public User updateUser(UserDto user) {
        User updatedUser = userRepository.findOneByUsername(user.getUsername());
        if (updatedUser != null) {

            updatedUser.setFirstName(user.getFirstName());
            updatedUser.setLastName(user.getLastName());
            updatedUser.setUsername(user.getUsername());
            updatedUser.setPassword(user.getPassword());
            updatedUser.setComments(user.getComments());
            updatedUser.setReplies(user.getReplies());
            return userRepository.save(updatedUser);

        }

        return null;


    }

    public void deleteUser(Long userId) {

        userRepository.deleteById(userId);
    }

    public User findUserById(Long userId) {

        return userRepository.findById(userId).get();
    }
}