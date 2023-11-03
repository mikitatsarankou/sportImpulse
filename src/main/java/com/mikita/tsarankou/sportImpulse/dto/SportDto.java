package com.mikita.tsarankou.sportImpulse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SportDto {
    @JsonProperty("id")
    private Long id;
    private String name;
    private String description;
}
