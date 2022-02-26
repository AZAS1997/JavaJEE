package Cigma.pfe.services;

import Cigma.pfe.models.Facture;
import Cigma.pfe.repositories.FactureRepository;

public class FactureServiceImp {




    FactureRepository factureRepository ;

    public void setFactureRepository(FactureRepository factureService) {
        this.factureRepository = factureService;
    }

    public void FactureServiceImpl(FactureRepository factureRepository) {
        this.factureRepository = factureRepository;
    }
    private FactureRepository dao;
    public void setDao(FactureRepository dao) {
        this.dao = dao;
    }

    public Facture save(Facture f) {
        return dao.save(f);
    }

    public Facture modify(Facture f) {
        return dao.update(f);
    }
    public Facture getById(long i) {
        return dao.findById(i);
    }
}
