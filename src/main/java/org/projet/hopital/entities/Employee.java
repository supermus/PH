package org.projet.hopital.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="employee")
public class Employee implements Serializable{
	

	private static final long serialVersionUID = 1L;
	private String prenom;
	private String nom;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long matricule;
	private Long idEmploye;
	
	@OneToMany
	private List<DossierPatient> dossiers;
	
	@OneToMany
	private List<RendezVous> rdv;
	
	@OneToOne
	private Role role;
	
	@OneToOne
	private Compte compte;
	
	public Employee(String prenom, String nom, Long idEmploye) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.idEmploye = idEmploye;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Long getMatricule() {
		return matricule;
	}

	public void setMatricule(Long matricule) {
		this.matricule = matricule;
	}

	public Long getNsecu() {
		return idEmploye;
	}

	public void setNsecu(Long nsecu) {
		this.idEmploye = nsecu;
	}

	public Long getIdEmploye() {
		return idEmploye;
	}

	public void setIdEmploye(Long idEmploye) {
		this.idEmploye = idEmploye;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	
	
	
	
	

}
