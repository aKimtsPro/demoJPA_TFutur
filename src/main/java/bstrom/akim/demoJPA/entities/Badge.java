package bstrom.akim.demoJPA.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Badge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String region;

    @Column
    private String arene;

    @OneToOne
    private Dresseur champion;
}
