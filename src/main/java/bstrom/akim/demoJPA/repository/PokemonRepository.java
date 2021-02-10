package bstrom.akim.demoJPA.repository;

import bstrom.akim.demoJPA.entities.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {
}
