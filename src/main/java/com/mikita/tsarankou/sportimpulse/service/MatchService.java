package com.mikita.tsarankou.sportimpulse.service;

import java.util.List;

import com.mikita.tsarankou.sportimpulse.dto.MatchDto;

public interface MatchService {
    List<MatchDto> findAll();
}
