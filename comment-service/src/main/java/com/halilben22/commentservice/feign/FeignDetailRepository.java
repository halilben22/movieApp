package com.halilben22.commentservice.feign;


import com.halilben22.commentservice.model.Detail;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("DETAILS-SERVICE")
public interface FeignDetailRepository {

    @GetMapping("/movie/detail/getById/{id}")
    public ResponseEntity<Detail> getById(@PathVariable Long id);
}
