package com.mikita.tsarankou.sportImpulse.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mikita.tsarankou.sportImpulse.entity.Match;
import com.mikita.tsarankou.sportImpulse.repository.MatchRepository;

@RestController
@RequestMapping("v1/matches")
public class MatchController {

    final MatchRepository matchRepository;

    public MatchController(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    @GetMapping()
    public List<Match> getAllMatches() {
        return matchRepository.findAll();
    }
}
