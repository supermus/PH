package org.projet.hopital.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.projet.hopital.entities.User;

public class hopitalDaoImpl implements IhopitalDao{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public void ajouterUser(User u) {
		em.persist(u);
	}
	
	private EntityManager em;
	
	public void AjouterD(Patient p){
		em.persist(p);
		System.out.println("le dossier est bien crée");
		
	}
	public Patient recherche(String nsecu){
		return em.find(Patient.class,nsecu);
	}
	public List<Patient> listPatients(String nsecu){
		return 0;
	}
	public void deletePatient(String nsecu){
		Patient p=em.find(Patient.class,nsecu);
		em.remove(p);
	}
	
}
