package com.halilben22.replyservice.feign;


import com.halilben22.replyservice.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("USER-SERVICE")
public interface ReplyUserFeignClient {



    @GetMapping("api/users/{userId}")
    ResponseEntity<User> findById(@PathVariable Long userId);
}
