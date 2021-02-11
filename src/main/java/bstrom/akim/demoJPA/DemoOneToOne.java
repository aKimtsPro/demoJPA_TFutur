package bstrom.akim.demoJPA;

import bstrom.akim.demoJPA.entities.Badge;
import bstrom.akim.demoJPA.entities.Dresseur;
import bstrom.akim.demoJPA.entities.simple.Directeur;
import bstrom.akim.demoJPA.entities.simple.Ecole;
import bstrom.akim.demoJPA.repository.BadgeRepository;
import bstrom.akim.demoJPA.repository.DresseurRepository;
import bstrom.akim.demoJPA.repository.simple.DirecteurRepository;
import bstrom.akim.demoJPA.repository.simple.EcoleRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoOneToOne {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DemoOneToOne.class, args);

        DirecteurRepository directeurRepository = ctx.getBean(DirecteurRepository.class);
        EcoleRepository ecoleRepository = ctx.getBean(EcoleRepository.class);

        Directeur directeur = Directeur.builder()
                .nom("popol")
                .build();
        Ecole ecole = Ecole.builder()
                .nom("Colecol")
                .build();

        directeurRepository.save(directeur);
        ecoleRepository.save(ecole);

//        directeur.setEcole(ecole);           // directeur gère la relation
//        directeurRepository.save(directeur); // exception

        ecole.setDirecteur(directeur);  // ecole gère la relation
        ecoleRepository.save(ecole);    // passe



    }
}
