package fr.epsi.service;

import fr.epsi.dao.ClientDao;
import fr.epsi.dao.ClientDaoImpl;
import fr.epsi.dao.LigneFactureDao;
import fr.epsi.dao.LigneFactureDaoImpl;
import fr.epsi.dto.ClientDTO;
import fr.epsi.dto.LigneFactureDTO;
import fr.epsi.entite.Client;
import fr.epsi.entite.LigneFacture;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;
import java.util.List;


@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class LigneFactureServiceImpl implements FactureLigneService {

	@PersistenceContext
	EntityManager em;
	
	@Resource
	UserTransaction utx;

	public void create(LigneFactureDTO lf) {
		LigneFacture ligneFacture = new LigneFacture();
		ligneFacture.setQte(lf.getQte());
		ligneFacture.setPrix(lf.getPrix());
		ligneFacture.setArticle(lf.getArticle());
		LigneFactureDao dao = new LigneFactureDaoImpl(em,utx);
		dao.create(ligneFacture);
	}

	public List<LigneFacture> getLignes() {
		LigneFactureDao ligneFactureDao = new LigneFactureDaoImpl(em, utx);
		return ligneFactureDao.getLigneFacture();
	}

}
