package com.mikita.tsarankou.sportImpulse.repository;

import com.mikita.tsarankou.sportImpulse.entity.Sport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SportRepository extends JpaRepository<Sport, Long> {
    // You can add custom query methods here if needed
}
