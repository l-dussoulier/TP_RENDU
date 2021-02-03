package fr.epsi.service;

import fr.epsi.dto.ArticleDTO;
import fr.epsi.entite.Article;
import fr.epsi.entite.Client;

import java.util.List;

public interface ArticleService {
	
	void create(ArticleDTO p);

	List<Article> getArticles();

}
