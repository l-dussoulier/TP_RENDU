package fr.epsi.service;

import fr.epsi.dto.LigneFactureDTO;
import fr.epsi.entite.LigneFacture;

import java.util.List;

public interface FactureLigneService {
	
	void create(LigneFactureDTO lf);

	List<LigneFacture> getLignes();

}
