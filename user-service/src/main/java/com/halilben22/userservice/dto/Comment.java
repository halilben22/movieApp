package com.halilben22.userservice.dto;

import lombok.Data;

@Data
public class Comment {
    private Long userId;
    private String commentText;
    private Long detailId;
}
