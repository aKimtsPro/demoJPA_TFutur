package bstrom.akim.demoJPA;

import bstrom.akim.demoJPA.dao.PokemonDAO;
import bstrom.akim.demoJPA.entities.Pokemon;
import bstrom.akim.demoJPA.injection.Caisse;
import bstrom.akim.demoJPA.injection.Magasin;
import bstrom.akim.demoJPA.repository.PokemonRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoJpaApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoJpaApplication.class, args);
		PokemonRepository repo = ctx.getBean(PokemonRepository.class);

		repo.findById(100);

	}

}
