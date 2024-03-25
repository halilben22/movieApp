package com.halilben22.detailsservice.controller;


import com.halilben22.detailsservice.dto.DetailRequest;
import com.halilben22.detailsservice.model.Detail;
import com.halilben22.detailsservice.service.DetailService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/movie/detail")
public class DetailController {


    private final DetailService service;

    public DetailController(DetailService service) {
        this.service = service;

    }

    @PostMapping("/create")
    public ResponseEntity<Detail> create(@RequestBody DetailRequest request) {

        return ResponseEntity.ok(service.create(request));

    }

    @GetMapping( "/getById/{id}")
    public ResponseEntity<Detail> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getDetailById(id));
    }


    @GetMapping("/getAll")
    public ResponseEntity<List<Detail>> getAllDetail() {
        return ResponseEntity.ok(service.getAll());
    }






}
