package com.mikita.tsarankou.sportImpulse.repository;

import com.mikita.tsarankou.sportImpulse.entity.TournamentRound;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TournamentRoundRepository extends JpaRepository<TournamentRound, Long> {
    // You can add custom query methods here if needed
}