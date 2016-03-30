package org.projet.hopital.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
@Table(name="user")

public class User implements Serializable{
	
	
	//testcommit
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long iduser;
	@NotEmpty
	private String username;
	private String password;
	private boolean activated;
	
	
	public Long getIduser() {
		return iduser;
	}
	public void setIduser(Long iduser) {
		this.iduser = iduser;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isActivated() {
		return activated;
	}
	public void setActivated(boolean activated) {
		this.activated = activated;
	}
	public User() {
		super();
	}
	public User(String username, String password,boolean activated) {
		super();
		this.username = username;
		this.password = password;
		this.activated = activated;
	}
	
		
}
