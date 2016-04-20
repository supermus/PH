

package org.projet.hopital.dao;

import  org.projet.hopital.entities.*;

import java.util.List;





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
	
}	