package com.halilben22.userservice.dto;

import jakarta.persistence.ElementCollection;
import lombok.Data;

import java.util.List;

@Data
public class UserDto {

    private String firstName;
    private String lastName;
    private String username;
    private String password;

    private List<Integer> comments;

    private List<Integer> replies;
}
