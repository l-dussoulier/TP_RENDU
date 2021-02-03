package fr.epsi.dto;

import java.util.Date;
import java.util.List;

public class FactureDTO {


	private Date Date;
	private String numero;
	private Double prix;
	private List<LigneFactureDTO> listeLigneFact;


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

	public List<LigneFactureDTO> getListeLigneFact() {
		return listeLigneFact;
	}

	public void setListeLigneFact(List<LigneFactureDTO> listeLigneFact) {
		this.listeLigneFact = listeLigneFact;
	}

	public void AddListeLigneFact(LigneFactureDTO ligneFactureDTO){
		this.listeLigneFact.add(ligneFactureDTO);
	}
}
