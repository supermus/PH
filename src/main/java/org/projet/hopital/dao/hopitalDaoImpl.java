package org.projet.hopital.dao;

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
	

}
