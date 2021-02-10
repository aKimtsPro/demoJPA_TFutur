package bstrom.akim.demoJPA.entities;

import lombok.*;

import javax.persistence.*;
import java.util.function.Supplier;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Pokemon implements Supplier<Pokemon> {

    @Id
    @Column(name = "numero_dex") // n'ecrase pas le nullable et unique inhérent à l'@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment
    private int numeroPokedex;

    @Column(name = "nom_pokemon", columnDefinition = "VARCHAR(40)", nullable = false, unique = true)
    private String nom;

    @Override
    public Pokemon get() {
        return new Pokemon();
    }
}
