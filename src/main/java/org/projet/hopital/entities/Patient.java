package org.projet.hopital.entities;
import java.io.Serializable;

public class Patient implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String nsecu;
	private String nom;
	private String prenom;
	private String date_naissance;

	
	public Patient() {
		super();
	}

	public Patient(String nsecu, String nom, String prenom, String date_naissance) {
		super();
		this.nsecu = nsecu;
		this.nom = nom;
		this.prenom = prenom;
		this.date_naissance = date_naissance;
	}
	
	
	public String getNsecu() {
		return nsecu;
	}
	public void setNsecu(String nsecu) {
		this.nsecu = nsecu;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(String date_naissance) {
		this.date_naissance = date_naissance;
	}


}
