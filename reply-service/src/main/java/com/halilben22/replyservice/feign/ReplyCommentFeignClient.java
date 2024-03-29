package com.halilben22.replyservice.feign;


import com.halilben22.replyservice.model.Comment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("COMMENT-SERVICE")
public interface ReplyCommentFeignClient {


    @GetMapping("/api/comments/{commentId}")
     ResponseEntity<Comment> findById(@PathVariable Long commentId);
}
