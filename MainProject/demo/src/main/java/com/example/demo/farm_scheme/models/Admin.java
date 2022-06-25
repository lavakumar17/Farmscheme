package com.example.demo.farm_scheme.models;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Admin_details")
public class Admin {
	

	@Id
	private String emailId;
	private String password;
	private String name;
	private long mobile_number;
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(long mobile_number) {
		this.mobile_number = mobile_number;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(String emailId, String password, String name, long mobile_number) {
		super();
		this.emailId = emailId;
		this.password = password;
		this.name = name;
		this.mobile_number = mobile_number;
	}
	

}

