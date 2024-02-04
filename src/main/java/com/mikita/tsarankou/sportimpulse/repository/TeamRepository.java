package com.mikita.tsarankou.sportimpulse.repository;

import com.mikita.tsarankou.sportimpulse.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
    // You can add custom query methods here if needed
}
