package com.mikita.tsarankou.sportimpulse.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Builder(toBuilder = true)
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "sports")
public class Sport {
    @Id
    @Column(name = "sport_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    @OneToMany(mappedBy = "sport", fetch = FetchType.LAZY)
    private Set<Referee> referees;

    @OneToMany(mappedBy = "sport", fetch = FetchType.LAZY)
    private Set<Tournament> tournaments;

    @OneToMany(mappedBy = "sport", fetch = FetchType.LAZY)
    private Set<Team> teams;

    @OneToMany(mappedBy = "sport", fetch = FetchType.LAZY)
    private Set<Player> players;
}