package fr.epsi.entite;

import fr.epsi.dto.LigneFactureDTO;

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
	@OneToMany
	private List<LigneFacture> listeLigneFact;


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

	public List<LigneFacture> getListeLigneFact() {
		return listeLigneFact;
	}

	public void setListeLigneFact(List<LigneFacture> listeLigneFact) {
		this.listeLigneFact = listeLigneFact;
	}

	public void AddListeLigneFact(LigneFacture ligneFacture){
		this.listeLigneFact.add(ligneFacture);
	}

	public Long getId() {
		return id;
	}
}
