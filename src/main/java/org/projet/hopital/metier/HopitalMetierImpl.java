package org.projet.hopital.metier;

import java.util.List;

import org.projet.hopital.entities.DossierPatient;
import org.projet.hopital.entities.Employee;
import org.projet.hopital.entities.RendezVous;
import org.projet.hopital.entities.Role;

public class HopitalMetierImpl implements IHopitalMetier {

	@Override
	public DossierPatient rechercherDossier(long idDossierPatient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DossierPatient> listeDossierPatient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modifierDossier(DossierPatient dp) {
		// TODO Auto-generated method stub

	}

	@Override
	public long ajouterDossier(DossierPatient dossier) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void ajouterRdv(long idDossierPatient, RendezVous rdv) {
		// TODO Auto-generated method stub

	}

	@Override
	public void modifierRdv(RendezVous rdv) {
		// TODO Auto-generated method stub

	}

	@Override
	public void supprimerRdv(long idDossierPatient, RendezVous rdv) {
		// TODO Auto-generated method stub

	}

	@Override
	public long ajouterEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void attribuerRole(long idEmploye, Role r) {
		// TODO Auto-generated method stub

	}

}
