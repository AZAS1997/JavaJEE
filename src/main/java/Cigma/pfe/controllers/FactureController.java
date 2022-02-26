package Cigma.pfe.controllers;

import Cigma.pfe.models.Facture;
import Cigma.pfe.services.FactureService;

public class FactureController {




    private FactureService service ;

    public FactureController(FactureService factureService) {

    }



    public void setService(FactureService service) {
        this.service = service;
    }

    public void save(Facture f){
        service.save(f);
    }
    public void modify(Facture f){
        service.modify(f);
    }
    public void removeById(long i){
        service.removeById(i);
    }

    public Facture getById(long i){
        return service.getById(i);
    }

}
