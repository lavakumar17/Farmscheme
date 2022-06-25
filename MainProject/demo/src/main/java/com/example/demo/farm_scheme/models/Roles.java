package com.example.demo.farm_scheme.models;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Roles {
	
	@Id
	private String emailId;
	private String role;
	public Roles(String emailId, String role) {
		super();
		this.emailId = emailId;
		this.role = role;
	}
	public Roles() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	

}

