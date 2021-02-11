package bstrom.akim.demoJPA.repository;

import bstrom.akim.demoJPA.entities.Dresseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DresseurRepository extends JpaRepository<Dresseur, Integer> {
}
