package org.projet.hopital.metier;

import java.util.List;


import org.projet.hopital.dao.IhopitalDao;
import org.projet.hopital.entities.*;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class HopitalMetierImpl implements IAdminMetier {
	
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
//pour le test 
	@Override
	public Long ajouterMedical(Medical m) {
		return dao.ajouterMedical(m) ;
	}
/*
	@Override
	public List<Medical> listeMedical() {
		return dao.listeMedical();
	}*/

	
}
