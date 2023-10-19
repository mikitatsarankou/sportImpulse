package com.mikita.tsarankou.sportImpulse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "roundmatches")
public class RoundMatch {
    @Id
    @ManyToOne
    private TournamentRound round;

    @Id
    @ManyToOne
    private Match match;

    public TournamentRound getRound() {
        return round;
    }

    public void setRound(TournamentRound round) {
        this.round = round;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }
}
