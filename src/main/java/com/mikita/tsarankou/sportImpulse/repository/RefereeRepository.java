package com.mikita.tsarankou.sportImpulse.repository;

import com.mikita.tsarankou.sportImpulse.entity.Referee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RefereeRepository extends JpaRepository<Referee, Long> {
    // You can add custom query methods here if needed
}