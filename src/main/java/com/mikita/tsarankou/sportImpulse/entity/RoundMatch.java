package com.mikita.tsarankou.sportImpulse.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
