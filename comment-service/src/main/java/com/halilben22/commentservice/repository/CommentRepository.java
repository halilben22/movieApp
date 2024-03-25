package com.halilben22.commentservice.repository;

import com.halilben22.commentservice.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}