package fr.epsi.controller;

import fr.epsi.entite.Article;
import fr.epsi.service.ArticleService;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//Couche WEB
@WebServlet(name = "ListArticleServlet", value = "/listeArticles")
public class ListeArticlesServlet extends HttpServlet{


	@EJB
	private ArticleService articleService;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		request.setAttribute("articles", articleService.getArticles());
		this.getServletContext().getRequestDispatcher("/WEB-INF/listeArticles.jsp").forward(request, response);

		for (Article article : articleService.getArticles()) {
			System.out.println(article.getNomProduit());
		}
	}

}
