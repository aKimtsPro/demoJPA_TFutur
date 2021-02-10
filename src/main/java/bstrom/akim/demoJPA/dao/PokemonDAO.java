package bstrom.akim.demoJPA.dao;

import bstrom.akim.demoJPA.entities.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Component
public class PokemonDAO {

    @PersistenceContext
    private EntityManager manager;

    @Transactional
    public Object insert(Object toInsert) {
        manager.persist(toInsert);
        return toInsert;
    }

    public Object getOne(Object id){
        return manager.find(Pokemon.class, id);
    }
}
