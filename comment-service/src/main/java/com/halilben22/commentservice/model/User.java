package com.halilben22.commentservice.model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;

@Data
public class User {

    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private List<Integer> comments;
    private List<Integer> replies;
}
