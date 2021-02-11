package bstrom.akim.demoJPA;

import bstrom.akim.demoJPA.entities.simple.Cours;
import bstrom.akim.demoJPA.entities.simple.Ecole;
import bstrom.akim.demoJPA.repository.simple.CoursRepository;
import bstrom.akim.demoJPA.repository.simple.EcoleRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;

@SpringBootApplication
public class DemoManyToMany {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoManyToMany.class,args);

        CoursRepository coursRep = context.getBean(CoursRepository.class);
        EcoleRepository ecoleRep = context.getBean(EcoleRepository.class);

        Cours cours = Cours.builder()
                .intitule("Cours de DB")
                .description("SQL vie")
                .build();

        Ecole ecole = Ecole.builder()
                .nom("TFTIC")
                .build();

        coursRep.save(cours);
        ecoleRep.save(ecole);

//        cours.setDonneDans(new ArrayList<>());
//        cours.getDonneDans().add(ecole);
//        coursRep.save(cours); // ne fait pas le lien (cours est l'entité faible de la relation)

        ecole.setCours(new ArrayList<>());
        ecole.getCours().add(cours);
        ecoleRep.save(ecole); // fait le lien (ecole est l'entité forte de la relation)




    }

}
