package Cigma.pfe.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Getter
@Setter
@Entity(name = "client")
@Inheritance(strategy = InheritanceType.JOINED)
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	public Client(String name) {
		this.name = name;
	}
	public Client() {
	}
	@OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "client")
	private List<Facture> factures;

	@OneToOne(cascade = {CascadeType.PERSIST},mappedBy = "client")
	private CarteFidelio carteFidelio;
	@OneToOne(cascade = {CascadeType.PERSIST})
	private Adresse adress ;

	@ManyToMany(cascade = {CascadeType.PERSIST})
	@JoinTable(name="my_join_table_client_promotion",joinColumns = @JoinColumn(
			name = "client_fk",
			referencedColumnName = "id"
	),
			inverseJoinColumns = @JoinColumn(
				name = "promotion_fk",
					referencedColumnName = "id"))

	private List<Promotion> promotions;

	@OneToOne(orphanRemoval = true)
	@JoinTable(name = "TClients_adresse",
			joinColumns = @JoinColumn(name = "client_null"),
			inverseJoinColumns = @JoinColumn(name = "adresse_id"))



	@Override
	public String toString() {
		return "Client{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';

	}



}
