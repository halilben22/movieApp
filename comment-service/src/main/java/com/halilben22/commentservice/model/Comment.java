package com.halilben22.commentservice.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Table(name = "comments")
@Data
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String commentText;
    private Long userId;
    private List<Integer> replies;
    private Long detailId;


}