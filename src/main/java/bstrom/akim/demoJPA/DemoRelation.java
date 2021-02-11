package bstrom.akim.demoJPA;

import bstrom.akim.demoJPA.entities.Dresseur;
import bstrom.akim.demoJPA.repository.DresseurRepository;
import bstrom.akim.demoJPA.service.DresseurService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.transaction.Transactional;

@SpringBootApplication
public class DemoRelation {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DemoJpaApplication.class, args);
        DresseurService service = ctx.getBean(DresseurService.class);

        Dresseur dresseur1 = Dresseur.builder()
                .numeroDresseur(1)
                .nom("popol")
                .build();
        Dresseur dresseur2 = Dresseur.builder()
                .numeroDresseur(2)
                .nom("papaola")
                .rival(dresseur1)
                .build();

        // Insert

//        repo.save(dresseur1);
//        repo.save(dresseur2);
//
//        dresseur1.setRival(dresseur2);
//        repo.save(dresseur1);

        // delete

        try {
            service.deleteById(1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



    }
}
