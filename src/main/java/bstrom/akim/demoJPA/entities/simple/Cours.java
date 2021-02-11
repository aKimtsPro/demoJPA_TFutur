package bstrom.akim.demoJPA.entities.simple;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cours {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String intitule;

    @Column
    private String description;

    @ManyToMany(mappedBy = "cours")
    private List<Ecole> donneDans;
}
