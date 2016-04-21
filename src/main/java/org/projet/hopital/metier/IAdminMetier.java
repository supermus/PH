package org.projet.hopital.metier;

import org.projet.hopital.entities.Employee;
import org.projet.hopital.entities.Role;

public interface IAdminMetier extends IReceptionnisteMetier{
	public long ajouterEmployee(Employee employee);
	
	public void attribuerRole(long idEmploye, Role r);
}
