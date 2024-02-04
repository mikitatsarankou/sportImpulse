package com.mikita.tsarankou.sportimpulse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mikita.tsarankou.sportimpulse.dto.MatchDto;
import com.mikita.tsarankou.sportimpulse.entity.Match;
import com.mikita.tsarankou.sportimpulse.mapper.MatchMapper;
import com.mikita.tsarankou.sportimpulse.repository.MatchRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class MatchServiceImpl implements MatchService {


    final MatchRepository matchRepository;
    final MatchMapper matchMapper;

    @Autowired
    public MatchServiceImpl(MatchRepository matchRepository, MatchMapper matchMapper) {
        this.matchRepository = matchRepository;
        this.matchMapper = matchMapper;
    }

    @Override
    public List<MatchDto> findAll() {
        List<Match> matches = matchRepository.findAll();
        return matches.stream().map(matchMapper::matchToMatchDTO).toList();
    }
}
