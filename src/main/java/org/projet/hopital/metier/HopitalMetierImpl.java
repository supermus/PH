package org.projet.hopital.metier;

import java.util.List;

import org.projet.hopital.entities.DossierPatient;
import org.projet.hopital.entities.Employee;
import org.projet.hopital.entities.RendezVous;
import org.projet.hopital.entities.Role;

public class HopitalMetierImpl implements IHopitalMetier {
	private IHopitalMetier dao;
	@Override
	public DossierPatient rechercherDossier(long idDossierPatient) {
		return dao.rechercherDossier(idDossierPatient);
	}

	@Override
	public List<DossierPatient> listeDossierPatient() {
		return dao.listeDossierPatient();
	}

	@Override
	public void modifierDossier(DossierPatient dp) {
		dao.modifierDossier(dp);

	}

	@Override
	public long ajouterDossier(DossierPatient dossier) {
		return dao.ajouterDossier(dossier);
	}

	@Override
	public void ajouterRdv(long idDossierPatient, RendezVous rdv) {
		dao.ajouterRdv(idDossierPatient, rdv);

	}

	@Override
	public void modifierRdv(RendezVous rdv) {
		dao.modifierRdv(rdv);

	}

	@Override
	public void supprimerRdv(long idDossierPatient, RendezVous rdv) {
		dao.supprimerRdv(idDossierPatient, rdv);

	}

	@Override
	public long ajouterEmployee(Employee employee) {
		
		return dao.ajouterEmployee(employee);
	}

	@Override
	public void attribuerRole(long idEmploye, Role r) {
		dao.attribuerRole(idEmploye, r);

	}

}
