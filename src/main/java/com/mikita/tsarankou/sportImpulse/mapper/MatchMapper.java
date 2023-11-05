package com.mikita.tsarankou.sportImpulse.mapper;

import org.mapstruct.Mapper;

import com.mikita.tsarankou.sportImpulse.dto.MatchDto;
import com.mikita.tsarankou.sportImpulse.dto.RefereeDto;
import com.mikita.tsarankou.sportImpulse.dto.SportDto;
import com.mikita.tsarankou.sportImpulse.dto.TournamentDto;
import com.mikita.tsarankou.sportImpulse.entity.Match;
import com.mikita.tsarankou.sportImpulse.entity.Referee;
import com.mikita.tsarankou.sportImpulse.entity.Sport;
import com.mikita.tsarankou.sportImpulse.entity.Tournament;

@Mapper(componentModel = "spring")
public interface MatchMapper {
    MatchDto matchToMatchDTO(Match entity);

    Match matchDTOtoMatch(MatchDto dto);


    TournamentDto tournamentToTournamentDTO(Tournament entity);

    Tournament tournamentDTOtoTournament(TournamentDto dto);

    SportDto sportToSportDTO(Sport entity);

    Sport sportDTOtoSport(SportDto dto);

    RefereeDto refereeToRefereeDTO(Referee entity);

    Referee refereeDTOtoReferee(RefereeDto dto);


}
