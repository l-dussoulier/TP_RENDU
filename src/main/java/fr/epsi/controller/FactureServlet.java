package fr.epsi.controller;

import fr.epsi.dto.ArticleDTO;
import fr.epsi.dto.FactureDTO;
import fr.epsi.dto.LigneFactureDTO;
import fr.epsi.service.ArticleService;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//Couche WEB
public class FactureServlet extends HttpServlet{
	
	@EJB
	private ArticleService service;
	//m?me chose 
	//private VoitureService service = new VoitureServiceImpl();
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	        
	    {
		  this.getServletContext().getRequestDispatcher("/WEB-INF/listeFactures.jsp").forward(req, resp);
	    }
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	        
	    {
	    	ArticleDTO articleDTO = new ArticleDTO();
	    	articleDTO.setNumero("AAA");
	    	articleDTO.setPrix(15.5);
	    	articleDTO.setNomProduit("banane");

			LigneFactureDTO ligneFactureDTO = new LigneFactureDTO();
			ligneFactureDTO.setArticleDTO(articleDTO);
			ligneFactureDTO.setQte(4);
			ligneFactureDTO.setPrix(100.00);


			FactureDTO factureDTO = new FactureDTO();
			factureDTO.AddListeLigneFact(ligneFactureDTO);

			System.out.println(factureDTO.getListeLigneFact());
			
	    }

}
