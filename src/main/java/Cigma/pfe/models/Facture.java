package Cigma.pfe.models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Entity(name = "TFactures")
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    double amount ;
    private String description;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;


    @ManyToMany(cascade = {CascadeType.PERSIST})
    @JoinTable(name="my_join_table_facture_produit",joinColumns = @JoinColumn(
            name = "facture_fk",
            referencedColumnName = "id"
    ),
            inverseJoinColumns = @JoinColumn(
                    name = "produit_fk",
                    referencedColumnName = "id"
            ))

    private List<Produit> produits;



    public Facture() {

    }

    public Facture (double amount){
        this.amount=amount;
    }
    public Facture(double amount, String description,Client client) {
        this.amount = amount;
        this.description = description;
        this.client =client;
    }

    public Facture(int id, double amount) {
        this.id=id;
        this.amount=amount ;
    }


}
