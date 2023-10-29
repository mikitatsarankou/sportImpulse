package com.mikita.tsarankou.sportImpulse.repository;

import java.util.List;

import com.mikita.tsarankou.sportImpulse.entity.Match;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import lombok.NonNull;

@Repository
public interface MatchRepository extends JpaRepository<Match, Long> {
    // You can add custom query methods here if needed
}
