package com.mikita.tsarankou.sportImpulse.mapper;

import org.mapstruct.Mapper;

import com.mikita.tsarankou.sportImpulse.dto.MatchDto;
import com.mikita.tsarankou.sportImpulse.entity.Match;

@Mapper(componentModel = "spring", uses = TournamentMapper.class)
public interface MatchMapper {
    MatchDto matchToMatchDTO(Match entity);

    Match matchDTOtoMatch(MatchDto dto);

}
