package org.projet.hopital.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="rendezvous")
public class RendezVous implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idRdv ;
	private String titreRdv;
	private String descriptionRdv ;
	private int heure;
	private Date date;
	@ManyToOne
	@JoinColumn(name="idService")
	private Service service;
	
	public RendezVous() {
		
	}

	public RendezVous(Long idRdv, String titreRdv, String descriptionRdv,
			int heure, Date date, Service service) {
		this.idRdv = idRdv;
		this.titreRdv = titreRdv;
		this.descriptionRdv = descriptionRdv;
		this.heure = heure;
		this.date = date;
		this.service = service;
	}

	public Long getIdRdv() {
		return idRdv;
	}

	public void setIdRdv(Long idRdv) {
		this.idRdv = idRdv;
	}

	public String getTitreRdv() {
		return titreRdv;
	}

	public void setTitreRdv(String titreRdv) {
		this.titreRdv = titreRdv;
	}

	public String getDescriptionRdv() {
		return descriptionRdv;
	}

	public void setDescriptionRdv(String descriptionRdv) {
		this.descriptionRdv = descriptionRdv;
	}

	

	public int getHeure() {
		return heure;
	}

	public void setHeure(int heure) {
		this.heure = heure;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}
	
	
	
	

}
