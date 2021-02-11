package bstrom.akim.demoJPA.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class Dresseur {

    @Id
    private int numeroDresseur;

    @Column
    private String nom;

    @OneToOne
    private Dresseur rival;

    @OneToMany(mappedBy = "dresseur")
    private List<Pokemon> pokemons;

    @OneToOne(mappedBy = "champion")
    private Badge championDe;
}
