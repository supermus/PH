package org.projet.hopital.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.projet.hopital.entities.*;

public class hopitalDaoImpl implements IhopitalDao{
//sALUT

	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public DossierPatient rechercherDossier(long idDossierPatient) {
		return em.find(DossierPatient.class,idDossierPatient);
	}

	
	@Override
	public  long ajouterEmployee(Employee employee) {
		em.persist(employee);
		return employee.getIdEmploye();
		
	}

	@Override
	public void attribuerRole(long idEmploye , Role r) {
		
		Employee employee=em.find(Employee.class, idEmploye );
		employee.setRole(r);
		em.persist(employee);
	}

	

	@Override
	public List<DossierPatient> listeDossierPatient() {
		Query req=em.createQuery("select d from DossierPatient d");				
		return req.getResultList();
	}


	@Override
	public void modifierDossier(DossierPatient dp) {
		
		em.merge(dp);
		
	}

	@Override
	public long ajouterDossier(DossierPatient dp) {
		em.persist(dp);
		return dp.getIdDossierPatient();
	}

	@Override
	public void ajouterRdv(long idDossierPatient , RendezVous rdv) {
		/*DossierPatient dp= em.find(DossierPatient.class, idDossierPatient);
		dp.getListRdv().add(rdv);
		em.persist(dp);*/
	}

	@Override
	public void modifierRdv(RendezVous rdv) {
	em.merge(rdv);
	}

	@Override
	public void supprimerRdv(long idDossierPatient, RendezVous rdv) {
		DossierPatient dp=em.find(DossierPatient.class, idDossierPatient);
		listeDossierPatient().remove(rdv);
				
	}


//pour le test 
	@Override
	public long ajouterMedical(Medical m) {
		em.persist(m);
		return m.getIdMedical();
		
	}


	/*@Override
	public List<Medical> listeMedical() {
		Query req=em.createQuery("select d from medical d");				
		return req.getResultList();
	}*/
	
	
}
