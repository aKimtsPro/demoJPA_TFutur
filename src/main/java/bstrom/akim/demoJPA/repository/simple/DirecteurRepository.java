package bstrom.akim.demoJPA.repository.simple;

import bstrom.akim.demoJPA.entities.simple.Directeur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirecteurRepository extends JpaRepository<Directeur, Integer> {
}
