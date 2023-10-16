package com.mikita.tsarankou.sportImpulse.repository;

import com.mikita.tsarankou.sportImpulse.entity.RoundMatch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoundMatchRepository extends JpaRepository<RoundMatch, Long> {
    // You can add custom query methods here if needed
}
