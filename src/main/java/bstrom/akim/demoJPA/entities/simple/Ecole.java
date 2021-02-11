package bstrom.akim.demoJPA.entities.simple;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Ecole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nom;

    @OneToOne
    private Directeur directeur;

    @ManyToMany
    private List<Cours> cours = new ArrayList<>();
}
