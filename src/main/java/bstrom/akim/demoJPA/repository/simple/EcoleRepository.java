package bstrom.akim.demoJPA.repository.simple;

import bstrom.akim.demoJPA.entities.simple.Ecole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EcoleRepository extends JpaRepository<Ecole, Integer> {
}
