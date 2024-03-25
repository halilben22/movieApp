package com.halilben22.userservice.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;


    @ElementCollection
    private List<Integer> comments;
    @ElementCollection
    private List<Integer> replies;
}
