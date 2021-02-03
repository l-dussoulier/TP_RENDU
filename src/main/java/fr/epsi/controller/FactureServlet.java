package fr.epsi.controller;


import fr.epsi.entite.Facture;
import fr.epsi.service.FactureService;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FactureServlet extends HttpServlet{

	@EJB
	private FactureService factureService;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		request.setAttribute("factures", factureService.getFactures());
		this.getServletContext().getRequestDispatcher("/WEB-INF/Factures.jsp").forward(request, response);

		for (Facture facture : factureService.getFactures()) {
			System.out.println(facture.getId());
		}
	}

}
