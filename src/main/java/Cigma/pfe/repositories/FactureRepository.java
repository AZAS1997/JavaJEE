package Cigma.pfe.repositories;import Cigma.pfe.models.Facture;public interface FactureRepository {    Facture save(Facture f) ;   Facture modify(Facture f);    Facture update(Facture f);    void deleteById(long idFacture);    Facture findById(long idFacture);}