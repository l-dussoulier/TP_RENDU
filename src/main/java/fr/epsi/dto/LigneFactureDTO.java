package fr.epsi.dto;

import java.util.Date;
import java.util.List;

public class LigneFactureDTO {


	private Integer qte;
	private Double prix;
	private ArticleDTO articleDTO;


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

	public ArticleDTO getArticleDTO() {
		return articleDTO;
	}

	public void setArticleDTO(ArticleDTO articleDTO) {
		this.articleDTO = articleDTO;
	}
}
