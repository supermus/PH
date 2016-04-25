package org.projet.hopital.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idEmploye;
	private String prenom;
	private String nom;
	private Long matricule;
	@OneToMany
	@JoinColumn( name = "idDossierPatient" )
	private Collection<DossierPatient> dossiers=new ArrayList<DossierPatient>();
	@OneToMany
	@JoinColumn( name = "idRdv" )
	private Collection<RendezVous> rdvs=new ArrayList<RendezVous>();
	@OneToOne
	@JoinColumn( name = "idRole" )
	private Role role;
	@OneToOne
	@JoinColumn( name = "iduser" )
	private Compte compte;
	
	public Employee() {
	}

	public Employee(String prenom, String nom, Long matricule, Collection<DossierPatient> dossiers,
			Collection<RendezVous> rdvs, Role role, Compte compte) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.matricule = matricule;
		this.dossiers = dossiers;
		this.rdvs = rdvs;
		this.role = role;
		this.compte = compte;
	}

	public Long getIdEmploye() {
		return idEmploye;
	}

	public void setIdEmploye(Long idEmploye) {
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

	public Collection<DossierPatient> getDossiers() {
		return dossiers;
	}

	public void setDossiers(Collection<DossierPatient> dossiers) {
		this.dossiers = dossiers;
	}

	public Collection<RendezVous> getRdvs() {
		return rdvs;
	}

	public void setRdvs(Collection<RendezVous> rdvs) {
		this.rdvs = rdvs;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	
	
	}
