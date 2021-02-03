package fr.epsi.entite;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Facture extends Object{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private java.util.Date Date;
	private String numero;
	private Double prix;
	@OneToMany(mappedBy="facture", fetch = FetchType.EAGER)
	private List<LigneFacture> LignesFacture;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "client_id")
	private Client client;


	public Date getDate() {
		return Date;
	}

	public void setDate(Date Date) {
		this.Date = Date;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public List<LigneFacture> getLignesFacture() {
		return LignesFacture;
	}

	public void setListeLigneFact(List<LigneFacture> listeLigneFact) {
		this.LignesFacture = listeLigneFact;
	}

	public void AddLignesFacture(LigneFacture ligneFacture){
		this.LignesFacture.add(ligneFacture);
	}

	public Long getId() { return id; }

	public Client getClient() {return client;}
}
