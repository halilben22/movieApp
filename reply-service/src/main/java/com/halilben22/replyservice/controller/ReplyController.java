package com.halilben22.replyservice.controller;

import com.halilben22.replyservice.dto.ReplyDto;
import com.halilben22.replyservice.model.Reply;
import com.halilben22.replyservice.service.ReplyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/replies")
public class ReplyController {


    private final ReplyService replyService;

    public ReplyController(ReplyService replyService) {
        this.replyService = replyService;
    }

    @PostMapping("/create")
    public ResponseEntity<Reply> createReply(@RequestBody ReplyDto replyDto) {
        Reply createdReply = replyService.createReply(replyDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdReply);
    }

    @PutMapping("/{replyId}")
    public ResponseEntity<Reply> updateReply(@PathVariable Long replyId, @RequestBody ReplyDto replyDto) {
        Reply updatedReply = replyService.updateReply(replyId, replyDto);
        return ResponseEntity.ok(updatedReply);
    }

    @DeleteMapping("/{replyId}")
    public ResponseEntity<Void> deleteReply(@PathVariable Long replyId) {
        replyService.deleteReply(replyId);
        return ResponseEntity.noContent().build();
    }


}