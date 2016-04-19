

package org.projet.hopital.entities;
import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="patient")
public class DossierPatient {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idDossierPatient;
	private Date dateCreation;
	private Medical dossierMedical;
	private Administratif dossierAdministratif;
	private List<RendezVous> listRdv;
	
	
	public DossierPatient() {
		super();
	}
	
	
	
	
	public List<RendezVous> getListRdv() {
		return listRdv;
	}




	public void setListRdv(List<RendezVous> listRdv) {
		this.listRdv = listRdv;
	}




	public DossierPatient(Date dateCreation) {
		super();
		this.dateCreation = dateCreation;
		this.dossierMedical = new Medical();
		this.dossierAdministratif = new Administratif();
	}

	
	public Long getIdDossierPatient() {
		return idDossierPatient;
	}

	
	public void setIdDossierPatient(Long idDossierPatient) {
		this.idDossierPatient = idDossierPatient;
	}

	
	public Date getDateCreation() {
		return dateCreation;
	}

	
	public void setDateCreation(Date dateCreation) {
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
	
	
	
	
	
	
	
}
