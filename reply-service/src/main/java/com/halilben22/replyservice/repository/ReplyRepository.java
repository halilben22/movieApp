package com.halilben22.replyservice.repository;

import com.halilben22.replyservice.model.Reply;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReplyRepository extends JpaRepository<Reply, Long> {
    List<Reply> findReplyByCommentId(Long commentId);
}