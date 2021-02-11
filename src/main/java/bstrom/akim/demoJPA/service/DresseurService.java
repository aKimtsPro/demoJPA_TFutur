package bstrom.akim.demoJPA.service;

import bstrom.akim.demoJPA.entities.Dresseur;
import bstrom.akim.demoJPA.repository.DresseurRepository;
import org.aspectj.apache.bcel.ExceptionConstants;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class DresseurService {

    private DresseurRepository repository;

    public DresseurService(DresseurRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void deleteById(int id) throws Exception{

        if(!repository.existsById(id)){
            throw new Exception("L'élément n'existe pas");
        }

        Dresseur d = repository.getOne(id);
        Dresseur rival = d.getRival();

        if(rival != null){
            rival.setRival(null);
            repository.save(rival);
        }

        repository.deleteById(id);
    }
}
