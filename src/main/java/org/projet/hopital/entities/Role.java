package org.projet.hopital.entities;
import java.io.Serializable;

import javax.persistence.*;
@Entity
@Table(name="role")
public class Role implements Serializable {
private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int idRole;
private String nomRole;							
@ManyToOne
@JoinColumn( name = "idEmploye" )
private Employee employe;

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
public Role() {
	super();
}
public Role(String nomRole, Employee employe) {
	super();
	this.nomRole = nomRole;
	this.employe = employe;
}


}