package bstrom.akim.demoJPA;

import bstrom.akim.demoJPA.entities.RacePokemon;
import bstrom.akim.demoJPA.repository.PokemonRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoJpaApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoJpaApplication.class, args);
		PokemonRepository repo = ctx.getBean(PokemonRepository.class);

		// Create
//
//		System.out.println("\n-------- Insert(save) ---------\n");
//		repo.save(new RacePokemon(150,"MewTwo"));
//		// repo.saveAll(new ArrayList<>()); // execute save pour chaque
//
//		// Read
//
		System.out.println("\n-------- Find by id ---------\n");
		RacePokemon toUpdate = repo.findById(4).get();
		System.out.println(toUpdate);

		System.out.println("\n-------- Find all ---------\n");
		repo.findAll().forEach(System.out::println);
//
//		// Update
//
//		System.out.println("\n-------- Update(save) ---------\n");
//		//toUpdate.setNom("Salamèche");
//		repo.save(new RacePokemon(3, "modifié"));
//		// Le choix insert/update se base ur l'existance
//		// ou non d'un enregistrement avec le meme id

		// Delete

//		System.out.println("\n-------- Delete one ---------\n");
//		repo.delete(RacePokemon.builder().nom("").numeroPokedex(3).build()); // delete selon l'id
//		System.out.println("\n-------- Delete by id ---------\n");
//		repo.deleteById(3);
//		System.out.println("\n-------- Delete all specified ---------\n");
//		repo.deleteAll(new ArrayList<>());
//		System.out.println("\n-------- Delete all ---------\n");
//		repo.deleteAll();


	}

}
