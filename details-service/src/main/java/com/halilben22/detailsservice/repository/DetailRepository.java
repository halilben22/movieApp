package com.halilben22.detailsservice.repository;

import com.halilben22.detailsservice.model.Detail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DetailRepository extends JpaRepository<Detail, Long> {
    Detail findByMovieName(String movieName);
}
