package org.projet.hopital.metier;

import org.projet.hopital.dao.IhopitalDao;
import org.projet.hopital.entities.Compte;

public class HopitalMetierImpl implements IAdminHopitalMetier{
	private IhopitalDao dao;
	@Override
	public void ajouterUser(Compte u) {
		dao.ajouterUser(u);
		
	}

}
