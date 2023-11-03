package com.mikita.tsarankou.sportImpulse.mapper;

import org.mapstruct.Mapper;

import com.mikita.tsarankou.sportImpulse.dto.TournamentDto;
import com.mikita.tsarankou.sportImpulse.entity.Tournament;

@Mapper(componentModel = "spring", uses = SportMapper.class)
public interface TournamentMapper {

    TournamentDto tournamentToTournamentDTO(Tournament entity);

    Tournament tournamentDTOtoTournament(TournamentDto dto);

}
