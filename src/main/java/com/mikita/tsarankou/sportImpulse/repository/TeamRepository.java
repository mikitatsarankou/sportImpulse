package com.mikita.tsarankou.sportImpulse.repository;

import com.mikita.tsarankou.sportImpulse.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
    // You can add custom query methods here if needed
}
