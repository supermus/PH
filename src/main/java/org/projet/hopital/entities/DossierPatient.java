package org.projet.hopital.entities;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.*;
@Entity
@Table(name="dossierpatient")
public class DossierPatient implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idDossierPatient;
	private String dateCreation;
	@ManyToOne
	@JoinColumn(name="idMedical")
	private Medical dossierMedical;
	@ManyToOne
	@JoinColumn(name="idAdministratif")
	private Administratif dossierAdministratif;
	@OneToMany
	@JoinColumn( name = "idRdv" )
	private Collection<RendezVous> rdvs=new ArrayList<RendezVous>();
	
	public DossierPatient() {
		super();
	}

	public DossierPatient(String dateCreation, Medical dossierMedical, Administratif dossierAdministratif,
			Collection<RendezVous> rdvs) {
		super();
		this.dateCreation = dateCreation;
		this.dossierMedical = dossierMedical;
		this.dossierAdministratif = dossierAdministratif;
		this.rdvs = rdvs;
	}

	public Long getIdDossierPatient() {
		return idDossierPatient;
	}

	public void setIdDossierPatient(Long idDossierPatient) {
		this.idDossierPatient = idDossierPatient;
	}

	public String getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Medical getDossierMedical() {
		return dossierMedical;
	}

	public void setDossierMedical(Medical dossierMedical) {
		this.dossierMedical = dossierMedical;
	}

	public Administratif getDossierAdministratif() {
		return dossierAdministratif;
	}

	public void setDossierAdministratif(Administratif dossierAdministratif) {
		this.dossierAdministratif = dossierAdministratif;
	}

	public Collection<RendezVous> getRdvs() {
		return rdvs;
	}

	public void setRdvs(Collection<RendezVous> rdvs) {
		this.rdvs = rdvs;
	}

	
}
