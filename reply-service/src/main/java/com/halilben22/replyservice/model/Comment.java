package com.halilben22.replyservice.model;

import lombok.Data;

import java.util.List;


@Data
public class Comment {

    private Long id;
    private String commentText;
    private Long userId;
    private List<Integer> replies;
    private Long detailId;


}