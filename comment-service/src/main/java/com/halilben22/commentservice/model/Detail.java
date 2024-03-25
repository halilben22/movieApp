package com.halilben22.commentservice.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data


public class Detail {

    private Long id;
    private String movieName;
    private String movieDescription;
    private String movieRate;
    private String movieDate;

    private List<Integer> commentList=new ArrayList<>();


}