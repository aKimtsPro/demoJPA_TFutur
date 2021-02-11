package bstrom.akim.demoJPA.repository.simple;

import bstrom.akim.demoJPA.entities.simple.Cours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursRepository extends JpaRepository<Cours, Integer> {
}
