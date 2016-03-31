package org.projet.hopital.dao;
import java.util.ArrayList;

public class Dossier {
	private int nDossier;
	private Patient patient;
	private ArrayList<Patient> ListPatient;
	
	
	
	
	public int getnDossier() {
		return nDossier;
	}
	public void setnDossier(int nDossier) {
		this.nDossier = nDossier;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Dossier(int nDossier, Patient patient) {
		super();
		this.nDossier = nDossier;
		this.patient = patient;
	}
	
	public void recherche(String nsecu){
		for(Patient p:ListPatient){
			if(p.getNsecu()==nsecu){
				System.out.println(p.getNom());
				System.out.println(p.getDate_naissance());
				System.out.println(p.getPrenom());
			}
		}
			
	}
	public void AjouterD(Patient p){
	try {
		
		ListPatient.add(p);
	
	} catch (Exception e) {
		e.printStackTrace();
      }
	}
	
	public void supprimerD(Patient p){
		try {
			
			ListPatient.remove(p);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
}
