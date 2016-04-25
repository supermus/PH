package org.projet.hopital.dao;

import java.util.List;

import org.projet.hopital.entities.*;

public interface IhopitalDao {
	
	public DossierPatient rechercherDossier (long idDossierPatient);
	
	public List<DossierPatient> listeDossierPatient();
	
	public void modifierDossier(DossierPatient dp);
	
	public long ajouterDossier(DossierPatient dossier);	
	void ajouterRdv(long idDossierPatient, RendezVous rdv);
	
	public void modifierRdv(RendezVous rdv);
	
	public void supprimerRdv(long idDossierPatient,RendezVous rdv);
	
	public long ajouterEmployee(Employee employee);
	
	public void attribuerRole(long idEmploye, Role r);
	
	//pour le test 
	 
	 
	public  long ajouterMedical(Medical m);		
	
}	