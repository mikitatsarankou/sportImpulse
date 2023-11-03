package com.mikita.tsarankou.sportImpulse.repository;

import java.util.List;

import com.mikita.tsarankou.sportImpulse.entity.Match;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import lombok.NonNull;

@Repository
public interface MatchRepository extends JpaRepository<Match, Long> {

    @Query(value = "SELECT m from Match m left join fetch m.tournament t left join fetch t.sport")
    @NonNull List<Match> findAll();
}
