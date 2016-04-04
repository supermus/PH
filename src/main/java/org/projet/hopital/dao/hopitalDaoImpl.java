package org.projet.hopital.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.projet.hopital.entities.Patient;
import org.projet.hopital.entities.User;

public class hopitalDaoImpl implements IhopitalDao{
	//mus comitta blast sarboute
	@PersistenceContext
	private EntityManager em;

	@Override
	public void ajouterUser(User u) {
		em.persist(u);
	}
	
	
	public void AjouterD(Patient p){
		em.persist(p);
		System.out.println("le dossier est bien crée");
		
	}
	public Patient recherche(String nsecu){
		return em.find(Patient.class,nsecu);
	}
	public List<Patient> listPatients(String nsecu){
		return null;
	}
	public void deletePatient(String nsecu){
		Patient p=em.find(Patient.class,nsecu);
		em.remove(p);
	}
	
}
