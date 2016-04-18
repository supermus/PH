package org.projet.hopital.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="administratif")
public class Administratif implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idAdministratif;
	private String nom;
	private String prenom;
	private String naissance;
	private String adresse;
	private Long nsecu;
	public Administratif() {
		super();
	}
	public Administratif(String nom, String prenom, String naissance,
			String adresse, Long nsecu) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.naissance = naissance;
		this.adresse = adresse;
		this.nsecu = nsecu;
	}
	public Long getIdAdministratif() {
		return idAdministratif;
	}
	public void setIdAdministratif(Long idAdministratif) {
		this.idAdministratif = idAdministratif;
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
	public String getNaissance() {
		return naissance;
	}
	public void setNaissance(String naissance) {
		this.naissance = naissance;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Long getNsecu() {
		return nsecu;
	}
	public void setNsecu(Long nsecu) {
		this.nsecu = nsecu;
	}
	
	
	
}
