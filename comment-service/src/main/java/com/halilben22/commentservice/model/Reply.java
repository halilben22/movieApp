package com.halilben22.commentservice.model;


import lombok.Data;

@Data
public class Reply {


    private Long id;


    private Long commentId;
    private Long userId;


    private String replyText;

}