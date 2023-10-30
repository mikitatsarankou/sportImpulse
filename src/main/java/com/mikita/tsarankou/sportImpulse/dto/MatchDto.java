package com.mikita.tsarankou.sportImpulse.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MatchDto {
    @JsonProperty("id")
    private Long id;
    private Date matchDate;
    private String location;
    private String result;
    private String score;
}
