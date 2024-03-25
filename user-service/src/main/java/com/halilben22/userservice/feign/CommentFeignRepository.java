package com.halilben22.userservice.feign;

import com.halilben22.userservice.dto.Comment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

@FeignClient(name = "COMMENT-SERVICE")
public interface CommentFeignRepository {

    @GetMapping("/api/comments/getCommentByUserId/{userId}")
    public ResponseEntity<List<Comment>> getCommentByUserId(@PathVariable Long userId);
}
