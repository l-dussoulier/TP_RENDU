package fr.epsi.entite;

import fr.epsi.entite.Article;
import javax.persistence.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LigneFacture extends Object{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Integer qte;
	private Double prix;

	@OneToOne
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

	public Article getArticleDTO() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}
}
