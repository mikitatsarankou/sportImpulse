package com.mikita.tsarankou.sportimpulse.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TournamentDto {
    private Long id;
    private SportDto sport;
    private String name;
    private Date startDate;
    private Date endDate;
    private String description;
}
