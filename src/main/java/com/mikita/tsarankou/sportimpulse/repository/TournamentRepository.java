package com.mikita.tsarankou.sportimpulse.repository;

import com.mikita.tsarankou.sportimpulse.entity.Tournament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TournamentRepository extends JpaRepository<Tournament, Long> {
    // You can add custom query methods here if needed
}
