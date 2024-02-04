package com.mikita.tsarankou.sportimpulse.repository;

import com.mikita.tsarankou.sportimpulse.entity.TournamentRound;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TournamentRoundRepository extends JpaRepository<TournamentRound, Long> {
    // You can add custom query methods here if needed
}
