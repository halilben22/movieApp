package com.halilben22.detailsservice.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
@Entity
@Table(name = "detail")
public class Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String movieName;
    private String movieDescription;
    private String movieRate;
    private String movieDate;
    @ElementCollection
    private List<Integer> commentList=new ArrayList<>();


}
