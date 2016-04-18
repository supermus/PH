package org.projet.hopital.entities;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;
@Entity
@Table(name="employee")
public class Role implements Serializable {
private static final long serialVersionUID = 1L;
private int idRole;
private String nomRole;
							
@ManyToOne
@JoinColumn( name = "idEmploye" )
private Employee employe;
@OneToOne(mappedBy="role")
private Compte compte; 
public int getIdRole() {
	return idRole;
}
public void setIdRole(int idRole) {
	this.idRole = idRole;
}
public String getNomRole() {
	return nomRole;
}
public void setNomRole(String nomRole) {
	this.nomRole = nomRole;
}
}