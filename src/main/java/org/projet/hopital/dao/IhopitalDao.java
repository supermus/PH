package org.projet.hopital.dao;

import  org.projet.hopital.entities.*;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.projet.hopital.entities.Compte;




public interface IhopitalDao {
	
	
	public DossierPatient rechercherDossier (long idDossierPatient);
	
	public List<DossierPatient> listeDossier();
	
	public void modifierDossier(long idDossierPatient);
	
	public boolean ajouterDossier(DossierPatient dossier);	
	
	public boolean ajouterRdv(DossierPatient dp, RendezVous rdv);
	
	public void modifierRdv(DossierPatient dp,RendezVous rdv);
	
	public boolean supprimerRdv(DossierPatient dp,RendezVous rdv);
	
	public void ajouterEmployee(Employee employee);
	
	public void attribuerRole(Employee employee, Role r);
	
}	
