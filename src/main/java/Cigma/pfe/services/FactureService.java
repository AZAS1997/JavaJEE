package Cigma.pfe.services;

import Cigma.pfe.models.Facture;

public interface FactureService {

    Facture save(Facture f) ;
    Facture modify(Facture f);
    void removeById(long i);
    Facture getById(long i);
}
