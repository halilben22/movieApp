package com.halilben22.commentservice.dto;

import lombok.Data;

@Data
public class CommentDto {
    private Long userId;
    private String commentText;
    private Long detailId;
}
