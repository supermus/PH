package org.projet.hopital.metier;

import org.projet.hopital.entities.DossierPatient;
import org.projet.hopital.entities.RendezVous;

public interface IReceptionnisteMetier extends IMedecinMetier{
	
	public long ajouterDossier(DossierPatient dossier);	
	
	void ajouterRdv(long idDossierPatient, RendezVous rdv);
	
	public void modifierRdv(RendezVous rdv);
	
	public void supprimerRdv(long idDossierPatient,RendezVous rdv);
}
