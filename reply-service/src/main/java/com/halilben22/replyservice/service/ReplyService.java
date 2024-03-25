package com.halilben22.replyservice.service;

import com.halilben22.replyservice.dto.ReplyDto;
import com.halilben22.replyservice.model.Reply;
import com.halilben22.replyservice.repository.ReplyRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ReplyService {


    private final ReplyRepository repository;

    public ReplyService(ReplyRepository repository) {
        this.repository = repository;
    }


    public Reply createReply(ReplyDto replyDto) {

        Reply reply = new Reply();
        reply.setCommentId(replyDto.getCommentId());
        reply.setReplyText(replyDto.getReplyText());
        reply.setUserId(replyDto.getUserId());

        return repository.save(reply);
    }

    public Reply updateReply(Long replyId, ReplyDto replyDto) {


        Reply reply;
        reply = repository.findById(replyId).get();
        if (reply == null) {

            return null;
        }
        reply = new Reply();
        reply.setReplyText(replyDto.getReplyText());

        return repository.save(reply);


    }

    public void deleteReply(Long replyId) {

        repository.deleteById(replyId);

    }
}
