package com.halilben22.commentservice.feign;


import com.halilben22.commentservice.model.Reply;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("REPLY-SERVICE")
public interface FeignReplyRepository {

    @GetMapping("/api/replies/getReplyByCommentId/{commentId}")
     ResponseEntity<List<Reply>> getReplyByCommentId(@PathVariable Long commentId);
}
