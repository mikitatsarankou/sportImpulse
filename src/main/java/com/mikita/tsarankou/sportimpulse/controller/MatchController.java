package com.mikita.tsarankou.sportimpulse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mikita.tsarankou.sportimpulse.dto.MatchDto;
import com.mikita.tsarankou.sportimpulse.service.MatchService;

@RestController
@RequestMapping("v1/matches")
public class MatchController {

    final MatchService matchService;

    @Autowired
    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @GetMapping()
    public List<MatchDto> getAllMatches() {
        return matchService.findAll();
    }
}
