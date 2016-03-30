package org.projet.hopital.dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.projet.hopital.entities.User;


public interface IhopitalDao {
	
	/*//public Long addPatient(Patient p);//on peut mettre void mais pour recuperer le client on doit mettre Client
	public Long addDossier(Patient p);
	public List<Dossier> listDossier();
	public List<Dossier> dossierParMotCle(String cle);
	
	*/
	
	public void ajouterUser(User u);
	
}	
