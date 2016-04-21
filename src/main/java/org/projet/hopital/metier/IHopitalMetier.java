package org.projet.hopital.metier;

import java.util.List;

import org.projet.hopital.entities.DossierPatient;
import org.projet.hopital.entities.Employee;
import org.projet.hopital.entities.RendezVous;
import org.projet.hopital.entities.Role;

public interface IHopitalMetier {
	
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
