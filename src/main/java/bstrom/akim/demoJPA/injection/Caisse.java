package bstrom.akim.demoJPA.injection;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Caisse implements InitializingBean {

    public final String verif = "caisse pas null";

    @Autowired
    private Magasin magasin;

//    public Caisse(Magasin magasin) {
//        this.magasin = magasin;
//    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Une caisse a été instanciée.");
    }
}
