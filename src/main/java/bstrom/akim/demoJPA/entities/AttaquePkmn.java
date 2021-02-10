package bstrom.akim.demoJPA.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Attaque")
@Getter @Setter
@AllArgsConstructor
@Builder
public class AttaquePkmn {

    @Id
    @Column(name = "unique_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String nom;

    @Column(name = "type_atk", nullable = false, length = 10/*columnDefinition = "varchar(10)"*/)
    private String type;

    @Column(name = "nbr_pp", nullable = false, columnDefinition = "int(2)" /*postgres : "numeric(2)"*/)
    private int nbrUtilisation;

    @Column(columnDefinition = "int(3)" /*postgres : "numeric(3)"*/)
    private Integer puissance;

    @Column(columnDefinition = "varchar(20)", nullable = false)
    private String categorie;

    @Column(name = "prec", columnDefinition = "int(3) default 100" /*postgres : "numeric(3)"*/)
    private Integer precision;

    @Column(nullable = false)
    private String description;
}
