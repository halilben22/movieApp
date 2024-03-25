package com.halilben22.commentservice.feign;


import com.halilben22.commentservice.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "USER-SERVICE")
public interface FeignUserRepository {

    @GetMapping("api/users/{userId}")
    public ResponseEntity<User> findById(@PathVariable Long userId);

}
