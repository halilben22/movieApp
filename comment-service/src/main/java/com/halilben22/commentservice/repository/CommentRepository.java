package com.halilben22.commentservice.repository;

import com.halilben22.commentservice.dto.CommentDto;
import com.halilben22.commentservice.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

import java.nio.ByteBuffer;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findAllCommentByUserId(Long userId);
}