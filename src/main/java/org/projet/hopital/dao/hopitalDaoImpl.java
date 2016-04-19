package org.projet.hopital.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.projet.hopital.entities.*;

public class hopitalDaoImpl implements IhopitalDao{
//sALUT
	@Override
	public DossierPatient rechercherDossier(long idDossierPatient) {
		
		return null;
	}

	@Override
	public void ajouterEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attribuerRole(Employee employee, Role r) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<DossierPatient> listeDossier() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modifierDossier(long idDossierPatient) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean ajouterDossier(DossierPatient dossier) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ajouterRdv(DossierPatient dp, RendezVous rdv) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void modifierRdv(DossierPatient dp, RendezVous rdv) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean supprimerRdv(DossierPatient dp, RendezVous rdv) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
