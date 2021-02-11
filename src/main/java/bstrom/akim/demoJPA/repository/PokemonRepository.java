package bstrom.akim.demoJPA.repository;

import bstrom.akim.demoJPA.entities.RacePokemon;
import org.springframework.data.jpa.repository.JpaRepository;

//@NoRepositoryBean - empeche l'instanciation par le container
public interface PokemonRepository extends JpaRepository<RacePokemon, Integer> {
}
