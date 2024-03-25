package com.halilben22.detailsservice.service;


import com.halilben22.detailsservice.dto.DetailRequest;
import com.halilben22.detailsservice.exception.AlreadyExistsException;
import com.halilben22.detailsservice.model.Detail;
import com.halilben22.detailsservice.repository.DetailRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DetailService {

    private final DetailRepository repository;


    public DetailService(DetailRepository repository) {
        this.repository = repository;
    }


    public Detail create(DetailRequest request) {
        Detail detail = new Detail();

        Detail name = repository.findByMovieName(request.getMovieName());
        if(name!=null) {

            throw new AlreadyExistsException("Already exists!")
            ;
        }

        detail.setMovieName(request.getMovieName());
        detail.setCommentList(request.getCommentList());
        detail.setMovieRate(request.getMovieRate());
        detail.setMovieDescription(request.getMovieDescription());
        detail.setMovieDate(request.getMovieDate());
        return repository.save(detail);
    }


    public Detail getDetailById(Long id) {
        return repository.findById(id).get();
    }

    public List<Detail> getAll() {
        return repository.findAll();
    }


}
