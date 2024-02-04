package com.mikita.tsarankou.sportimpulse.repository;

import com.mikita.tsarankou.sportimpulse.entity.Referee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RefereeRepository extends JpaRepository<Referee, Long> {
    // You can add custom query methods here if needed
}
