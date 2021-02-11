package bstrom.akim.demoJPA.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String surnom;

    @ManyToOne
    private Dresseur dresseur;

    @ManyToOne
    private RacePokemon race;

    @ManyToMany
    private List<AttaquePkmn> attaques;
}
