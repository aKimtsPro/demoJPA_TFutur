package bstrom.akim.demoJPA;

import bstrom.akim.demoJPA.entities.simple.Ecole;
import bstrom.akim.demoJPA.service.EcoleService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoAjoute {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DemoAjoute.class, args);

        EcoleService service = ctx.getBean(EcoleService.class);

        try {
            service.ajouterCours(8, 6);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
