package com.mikita.tsarankou.sportImpulse.service;

import java.util.List;

import com.mikita.tsarankou.sportImpulse.dto.MatchDto;

public interface MatchService {
    List<MatchDto> findAll();
}
