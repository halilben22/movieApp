package com.halilben22.userservice.controller;

import com.halilben22.userservice.dto.Comment;
import com.halilben22.userservice.dto.UserDto;
import com.halilben22.userservice.model.User;
import com.halilben22.userservice.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {


    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody UserDto user) {
        User createdUser = userService.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }

    @PutMapping("/{userId}")
    public ResponseEntity<User> updateUser(@PathVariable Long userId, @RequestBody UserDto user) {
        User updatedUser = userService.updateUser(user);
        return ResponseEntity.ok(updatedUser);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long userId) {
        userService.deleteUser(userId);
        return ResponseEntity.noContent().build();
    }


    @GetMapping("/{userId}")
    public ResponseEntity<User> findById(@PathVariable Long userId) {
        User user = userService.findUserById(userId);
        return ResponseEntity.ok(user);
    }


    @GetMapping("/getComments/{userId}")
    public ResponseEntity<List<Comment>>getUserComments(@PathVariable Long userId) {

        List<Comment> comments = userService.findUserComments(userId);
        return ResponseEntity.ok(comments);
    }


}