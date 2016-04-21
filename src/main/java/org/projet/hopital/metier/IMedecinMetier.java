package org.projet.hopital.metier;

import java.util.List;

import org.projet.hopital.entities.DossierPatient;

public interface IMedecinMetier {
	
	public DossierPatient rechercherDossier (long idDossierPatient);
	
	public List<DossierPatient> listeDossierPatient();
	
	public void modifierDossier(DossierPatient dp);

}
