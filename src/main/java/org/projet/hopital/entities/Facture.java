package org.projet.hopital.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="compte")
public class Facture {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long idFacture;
private int montant;
private String date;


public Facture() {
}
public Facture(int montant, String date) {
	this.montant = montant;
	this.date = date;
}
public int getMontant() {
	return montant;
}
public void setMontant(int montant) {
	this.montant = montant;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}


}
