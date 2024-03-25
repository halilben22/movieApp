package com.halilben22.replyservice.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "replies")
@Data
public class Reply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Long commentId;
    private Long userId;

    @Column(name = "reply_text")
    private String replyText;

}