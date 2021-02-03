package fr.epsi.service;

import fr.epsi.dao.FactureDao;
import fr.epsi.dao.FactureDaoImpl;
import fr.epsi.dto.FactureDTO;
import fr.epsi.entite.Facture;
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
public class FactureServiceImpl implements FactureService {

	@PersistenceContext
	EntityManager em;
	
	@Resource
	UserTransaction utx;
	
	public void create(FactureDTO f) {
		Facture facture = new Facture();
		facture.setNumero(f.getNumero());
		facture.setPrix(f.getPrix());
		facture.setDate(f.getDate());
		facture.setListeLigneFact(f.getListeLigneFact());
		FactureDao dao = new FactureDaoImpl(em,utx);
		dao.create(facture);
	}

	public List<Facture> getFactures() {
		FactureDao FactureDao = new FactureDaoImpl(em, utx);
		return FactureDao.getFactures();
	}

	public Facture getById(long id) {
		FactureDao factureDao = new FactureDaoImpl(em, utx);
		return factureDao.getById(id);
	}

}
