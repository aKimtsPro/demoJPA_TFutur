package bstrom.akim.demoJPA.entities;

import lombok.*;

import javax.persistence.*;
import java.util.function.Supplier;

@Entity
@Data // = @Getter + @Setter + @ToString + @EqualsAndHashcode
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class RacePokemon {

    @Id
    @Column(name = "numero_dex") // n'ecrase pas le nullable et unique inhérent à l'@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment
    private int numeroPokedex;

    @NonNull
    @Column(name = "nom_pokemon", columnDefinition = "VARCHAR(40)", nullable = false, unique = true)
    private String nom;

}
