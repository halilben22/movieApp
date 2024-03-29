package com.halilben22.commentservice.controller;


import com.halilben22.commentservice.dto.CommentDto;
import com.halilben22.commentservice.model.Comment;
import com.halilben22.commentservice.model.Reply;
import com.halilben22.commentservice.service.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentController {


    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping("/create")
    public ResponseEntity<Comment> createComment(@RequestBody CommentDto commentDto) {
        Comment createdComment = commentService.createComment(commentDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdComment);
    }

    @PutMapping("/{commentId}")
    public ResponseEntity<Comment> updateComment(@PathVariable Long commentId, @RequestBody CommentDto commentDto) {
        Comment updatedComment = commentService.updateComment(commentId, commentDto);
        return ResponseEntity.ok(updatedComment);
    }

    @DeleteMapping("/{commentId}")
    public ResponseEntity<Void> deleteComment(@PathVariable Long commentId) {
        commentService.deleteComment(commentId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/getCommentByUserId/{userId}")
    public ResponseEntity<List<Comment>> getCommentByUserId(@PathVariable Long userId) {
        List<Comment> comment = commentService.findCommentByUserId(userId);
        return ResponseEntity.ok(comment);
    }

    @GetMapping("/{commentId}")
    public ResponseEntity<Comment> findById(@PathVariable Long commentId) {
        Comment comment = commentService.findById(commentId);
        return ResponseEntity.ok(comment);
    }


    @GetMapping("/getRepliesByCommentId/{commentId}")
    public ResponseEntity<List<Reply>> getReplyByCommentId(@PathVariable Long commentId) {
        List<Reply> replies = commentService.getRepliesByCommentId(commentId);
        return ResponseEntity.ok(
                replies
        );
    }


}