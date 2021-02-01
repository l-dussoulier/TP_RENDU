package fr.epsi.service;

import fr.epsi.dao.ProduitDao;
import fr.epsi.dao.ProduitDaoImpl;
import fr.epsi.dto.ProduitDTO;
import fr.epsi.entite.Produit;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;


@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class ProduitServiceImpl implements ProduitService {

	@PersistenceContext
	EntityManager em;
	
	@Resource
	UserTransaction utx;
	
	public void create(ProduitDTO p)  {
		
		Produit produit = new Produit();
		produit.setNumero(p.getNumero());
		produit.setNomProduit(p.getNomProduit());
		produit.setPrix(p.getPrix());
		ProduitDao dao =new ProduitDaoImpl(em, utx);
		
		dao.create(produit);
		
	}

}
