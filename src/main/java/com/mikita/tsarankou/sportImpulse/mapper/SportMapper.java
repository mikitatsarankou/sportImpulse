package com.mikita.tsarankou.sportImpulse.mapper;

import org.mapstruct.Mapper;

import com.mikita.tsarankou.sportImpulse.dto.SportDto;
import com.mikita.tsarankou.sportImpulse.entity.Sport;

@Mapper(componentModel = "spring")
public interface SportMapper {

    SportDto sportToSportDTO(Sport entity);

    Sport sportDTOtoSport(SportDto dto);
}
