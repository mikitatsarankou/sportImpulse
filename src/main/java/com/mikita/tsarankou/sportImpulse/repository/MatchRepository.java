package com.mikita.tsarankou.sportImpulse.repository;

import com.mikita.tsarankou.sportImpulse.entity.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<Match, Long> {
    // You can add custom query methods here if needed
}