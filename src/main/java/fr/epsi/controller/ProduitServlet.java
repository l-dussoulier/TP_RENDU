package fr.epsi.controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.dto.ProduitDTO;
import fr.epsi.service.ProduitService;

//Couche WEB
public class ProduitServlet extends HttpServlet{
	
	@EJB
	private ProduitService service;
	//m?me chose 
	//private VoitureService service = new VoitureServiceImpl();
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	        
	    {
		  this.getServletContext().getRequestDispatcher("/WEB-INF/createProduit.jsp").forward(req, resp);
	    }
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	        
	    {
			ProduitDTO vDTO=new ProduitDTO();
			vDTO.setNumero( req.getParameter("numero"));
			vDTO.setNomProduit(req.getParameter("nomProduit"));
			vDTO.setPrix(req.getParameter("prix"));
			service.create(vDTO);
			
	    }

}
