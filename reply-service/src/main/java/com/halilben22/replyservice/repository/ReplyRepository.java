package com.halilben22.replyservice.repository;

import com.halilben22.replyservice.model.Reply;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReplyRepository extends JpaRepository<Reply, Long> {
}