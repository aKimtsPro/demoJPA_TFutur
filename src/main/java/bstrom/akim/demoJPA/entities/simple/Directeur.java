package bstrom.akim.demoJPA.entities.simple;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Directeur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nom;

    @OneToOne(mappedBy = "directeur")
    private Ecole ecole;

}
