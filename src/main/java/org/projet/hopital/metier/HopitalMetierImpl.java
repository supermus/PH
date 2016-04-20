package org.projet.hopital.metier;

import java.util.List;

import org.projet.hopital.dao.IhopitalDao;
import org.projet.hopital.entities.DossierPatient;
import org.projet.hopital.entities.Employee;
import org.projet.hopital.entities.RendezVous;
import org.projet.hopital.entities.Role;

public class HopitalMetierImpl implements IHopitalMetier {
	private IhopitalDao dao;
	
	public void setDao(IhopitalDao dao) {
		this.dao = dao;
	}

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
	public void modifierRdv(DossierPatient dp, RendezVous rdv) {
		dao.modifierRdv(dp, rdv);

	}

	@Override
	public boolean supprimerRdv(DossierPatient dp, RendezVous rdv) {
		
		return dao.supprimerRdv(dp, rdv);
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
