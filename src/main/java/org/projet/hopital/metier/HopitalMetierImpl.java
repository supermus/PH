package org.projet.hopital.metier;

import org.projet.hopital.dao.IhopitalDao;
import org.projet.hopital.entities.User;

public class HopitalMetierImpl implements IAdminHopitalMetier{
	private IhopitalDao dao;
	@Override
	public void ajouterUser(User u) {
		dao.ajouterUser(u);
		
	}

}
