package fr.epsi.controller;

import fr.epsi.dto.ArticleDTO;
import fr.epsi.dto.FactureDTO;
import fr.epsi.dto.LigneFactureDTO;
import fr.epsi.entite.Client;
import fr.epsi.service.ArticleService;
import fr.epsi.service.ClientService;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//Couche WEB
@WebServlet(name = "ListClientServlet", value = "/listeClient")
public class ListeClientServlet extends HttpServlet{


	@EJB
	private ClientService clientService;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		request.setAttribute("clients", clientService.getClients());
		this.getServletContext().getRequestDispatcher("/WEB-INF/listeClient.jsp").forward(request, response);

		for (Client client : clientService.getClients()) {
			System.out.println(client.getNom());
		}
	}

}
