package org.projet.hopital.metier;

import java.util.List;

import org.projet.hopital.entities.*;

public interface IAdminMetier extends IReceptionnisteMetier{
	public long ajouterEmployee(Employee employee);
	
	public void attribuerRole(long idEmploye, Role r);
	//pour le test 
	public Long ajouterMedical(Medical m);
	/*public List<Medical> listeMedical();*/
	
	
}
