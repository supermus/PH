package org.projet.hopital.entities;

public class Facture {
private int montant;
private String date;


public Facture() {
	super();
}
public Facture(int montant, String date) {
	super();
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
