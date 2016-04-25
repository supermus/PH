package org.projet.hopital.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "medical")
public class Medical implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idMedical;
	private String motif;
	private String observation;
	private String desciption;
	
	public Medical() {
		super();
	}

	public Medical(String motif, String observation, String desciption) {
		this.motif = motif;
		this.observation = observation;
		this.desciption = desciption;
	}

	public Long getIdMedical() {
		return idMedical;
	}

	public void setIdMedical(Long idMedical) {
		this.idMedical = idMedical;
	}

	public String getMotif() {
		return motif;
	}

	public void setMotif(String motif) {
		this.motif = motif;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public String getDesciption() {
		return desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}
	
	

}
