package fr.epsi.dto;

import fr.epsi.entite.Article;

import java.util.Date;
import java.util.List;

public class LigneFactureDTO {


	private Integer qte;
	private Double prix;
	private Article article;


	public Integer getQte() {
		return qte;
	}

	public void setQte(Integer qte) {
		this.qte = qte;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article= article;
	}
}
