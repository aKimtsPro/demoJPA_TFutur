package bstrom.akim.demoJPA;

import bstrom.akim.demoJPA.dao.PokemonDAO;
import bstrom.akim.demoJPA.entities.Pokemon;
import bstrom.akim.demoJPA.injection.Caisse;
import bstrom.akim.demoJPA.injection.Magasin;
import bstrom.akim.demoJPA.repository.PokemonRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;

@SpringBootApplication
public class DemoJpaApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoJpaApplication.class, args);
		PokemonRepository repo = ctx.getBean(PokemonRepository.class);

		// Create
//
//		System.out.println("\n-------- Insert(save) ---------\n");
//		repo.save(new Pokemon(150,"MewTwo"));
//		// repo.saveAll(new ArrayList<>()); // execute save pour chaque
//
//		// Read
//
//		System.out.println("\n-------- Find by id ---------\n");
//		Pokemon toUpdate = repo.findById(4).get();
//		System.out.println(toUpdate);
//
//		System.out.println("\n-------- Find all ---------\n");
//		repo.findAll().forEach(System.out::println);
//
//		// Update
//
//		System.out.println("\n-------- Update(save) ---------\n");
//		//toUpdate.setNom("Salamèche");
//		repo.save(new Pokemon(3, "modifié"));
//		// Le choix insert/update se base ur l'existance
//		// ou non d'un enregistrement avec le meme id

		// Delete

		System.out.println("\n-------- Delete one ---------\n");
		repo.delete(new Pokemon(3, "a supprimer")); // delete selon l'id
		System.out.println("\n-------- Delete by id ---------\n");
		repo.deleteById(3);
		System.out.println("\n-------- Delete all specified ---------\n");
		repo.deleteAll(new ArrayList<>());
		System.out.println("\n-------- Delete all ---------\n");
		repo.deleteAll();


	}

}
