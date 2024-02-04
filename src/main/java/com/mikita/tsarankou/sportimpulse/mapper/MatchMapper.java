package com.mikita.tsarankou.sportimpulse.mapper;

import org.mapstruct.Mapper;

import com.mikita.tsarankou.sportimpulse.dto.MatchDto;
import com.mikita.tsarankou.sportimpulse.dto.RefereeDto;
import com.mikita.tsarankou.sportimpulse.dto.SportDto;
import com.mikita.tsarankou.sportimpulse.dto.TournamentDto;
import com.mikita.tsarankou.sportimpulse.entity.Match;
import com.mikita.tsarankou.sportimpulse.entity.Referee;
import com.mikita.tsarankou.sportimpulse.entity.Sport;
import com.mikita.tsarankou.sportimpulse.entity.Tournament;

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
