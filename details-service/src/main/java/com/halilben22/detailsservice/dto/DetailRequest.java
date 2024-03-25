package com.halilben22.detailsservice.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class DetailRequest {
    private String movieName;
    private String movieDescription;
    private String movieRate;
    private String movieDate;
    private List<Integer> commentList=new ArrayList<>();
}
