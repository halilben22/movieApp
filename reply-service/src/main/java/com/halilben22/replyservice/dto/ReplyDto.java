package com.halilben22.replyservice.dto;


import lombok.Data;

@Data
public class ReplyDto {


    private Long commentId;
    private Long userId;
    private String replyText;
}
