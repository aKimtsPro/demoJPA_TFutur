package bstrom.akim.demoJPA.injection;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Magasin implements InitializingBean {

    private Caisse caisse;

    public Magasin(Caisse caisse) {
        this.caisse = caisse;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Le magasin a été instancié. " + caisse.verif);
    }
}
