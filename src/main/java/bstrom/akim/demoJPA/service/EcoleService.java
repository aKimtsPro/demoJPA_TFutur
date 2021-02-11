package bstrom.akim.demoJPA.service;

import bstrom.akim.demoJPA.entities.simple.Cours;
import bstrom.akim.demoJPA.entities.simple.Ecole;
import bstrom.akim.demoJPA.repository.simple.CoursRepository;
import bstrom.akim.demoJPA.repository.simple.EcoleRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
public class EcoleService {

    private EcoleRepository ecoleRepo;
    private CoursRepository coursRepo;

    public EcoleService(EcoleRepository ecoleRepo, CoursRepository coursRepo) {
        this.ecoleRepo = ecoleRepo;
        this.coursRepo = coursRepo;
    }

    @Transactional
    public void ajouterCours(int id_ecole, int id_cours) throws Exception {

        if( !ecoleRepo.existsById(id_ecole) || !coursRepo.existsById(id_cours) )
            throw new Exception("paramètre invalide");

        Ecole ecole = ecoleRepo.getOne(id_ecole);
        Cours cours = coursRepo.getOne(id_cours);

        if(ecole.getCours() == null)
            ecole.setCours(new ArrayList<>());

        ecole.getCours().add(cours);
    }
}
