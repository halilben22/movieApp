package com.halilben22.commentservice.service;


import com.halilben22.commentservice.dto.CommentDto;
import com.halilben22.commentservice.feign.FeignDetailRepository;
import com.halilben22.commentservice.feign.FeignReplyRepository;
import com.halilben22.commentservice.feign.FeignUserRepository;
import com.halilben22.commentservice.model.Comment;
import com.halilben22.commentservice.model.Detail;
import com.halilben22.commentservice.model.Reply;
import com.halilben22.commentservice.model.User;
import com.halilben22.commentservice.repository.CommentRepository;
import jakarta.ws.rs.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    private final CommentRepository commentRepository;
    private final FeignUserRepository feignRepository;
    private final FeignDetailRepository feignDetailRepository;

    private final FeignReplyRepository feignReplyRepository;

    public CommentService(CommentRepository commentRepository, FeignUserRepository feignRepository, FeignDetailRepository feignDetailRepository, FeignReplyRepository feignReplyRepository) {
        this.commentRepository = commentRepository;
        this.feignRepository = feignRepository;
        this.feignDetailRepository = feignDetailRepository;
        this.feignReplyRepository = feignReplyRepository;
    }

    public Comment createComment(CommentDto commentDto) {
        User user = feignRepository.findById(commentDto.getUserId()).getBody();
        Detail detail = feignDetailRepository.getById(commentDto.getDetailId()).getBody();


        if (user == null || detail == null) {
            throw new NotFoundException("User or Detail not found");

        }
        Comment comment = new Comment();
        comment.setCommentText(commentDto.getCommentText());
        comment.setUserId(commentDto.getUserId());
        comment.setDetailId(commentDto.getDetailId());
        return commentRepository.save(comment);

    }

    public Comment updateComment(Long commentId, CommentDto commentDto) {
        Comment comment = commentRepository.findById(commentId).get();
        comment.setCommentText(commentDto.getCommentText());
        comment.setUserId(commentDto.getUserId());
        comment.setDetailId(commentDto.getDetailId());
        return commentRepository.save(comment);

    }

    public void deleteComment(Long commentId) {

        Comment comment = commentRepository.findById(commentId).get();

        commentRepository.delete(comment);

    }

    public List<Comment> findCommentByUserId(Long userId) {

        return commentRepository.findAllCommentByUserId(userId);

    }

    public Comment findById(Long commentId) {


        return commentRepository.findById(commentId).get();
    }

    public List<Reply> getRepliesByCommentId(Long commentId) {

        return feignReplyRepository.getReplyByCommentId(commentId).getBody();

    }
}
