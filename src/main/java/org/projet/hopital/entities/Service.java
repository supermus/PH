package org.projet.hopital.entities;
import java.io.Serializable;
//entités jpa terminée
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="service")
public class Service implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idService;
	private String nom;
	private int capacite;
	@OneToMany(mappedBy="service")
	private Collection<RendezVous> rdvs = new ArrayList<RendezVous>();
	public Service() {
		super();
	}
	public Service(String nom, int capacite, Collection<RendezVous> rdvs) {
		super();
		this.nom = nom;
		this.capacite = capacite;
		this.rdvs = rdvs;
	}
	public Long getIdService() {
		return idService;
	}
	public void setIdService(Long idService) {
		this.idService = idService;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getCapacite() {
		return capacite;
	}
	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}
	public Collection<RendezVous> getRdvs() {
		return rdvs;
	}
	public void setRdvs(Collection<RendezVous> rdvs) {
		this.rdvs = rdvs;
	}
	
	
}
