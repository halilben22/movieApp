package com.halilben22.userservice.repository;

import com.halilben22.userservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findOneByUsername(String username);
}