package fr.epsi.controller;


import fr.epsi.entite.Facture;
import fr.epsi.entite.LigneFacture;
import fr.epsi.service.FactureService;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FactureDetailServlet extends HttpServlet {

    @EJB
    private FactureService factureService;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Facture facture = factureService.getById(Long.parseLong(request.getParameter("id"))); // permet de passer id de la facture pour afficher ensuite le détail
        System.out.println(facture.getNumero());
        System.out.println(facture.getLignesFacture().size());
        for (LigneFacture ligne : facture.getLignesFacture()) {
            System.out.println(ligne.getQte());
        }
        request.setAttribute("facture", facture);

        this.getServletContext().getRequestDispatcher("/WEB-INF/detail.jsp").forward(request, response);
    }
}
