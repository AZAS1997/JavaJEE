package Cigma.pfe.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@Entity(name = "TAdresse")
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String avenue;
    String ville ;
    String pays;

    public Adresse() {
    }
    @OneToOne(cascade = {CascadeType.PERSIST},mappedBy = "adress")
    private Client client;
}
