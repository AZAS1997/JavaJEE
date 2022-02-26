package Cigma.pfe.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@ToString
@Entity(name = "TProduits")
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name ;
    double price ;

    @ManyToMany(cascade = {CascadeType.PERSIST})
    @JoinTable(name="my_join_table_facture_produit",joinColumns = @JoinColumn(
            name = "produit_fk",
            referencedColumnName = "id"
    ),
            inverseJoinColumns = @JoinColumn(
                    name = "facture_fk",
                    referencedColumnName = "id"
            ))

    private List<Facture> factures;

}
