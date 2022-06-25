package com.example.demo.farm_scheme.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bidder {
	@Id
	String email;
	String name;
	long contact;
	String address1;
	String address2;
	String city;
	String state;
	int pincode;
	long accountNo;
	String ifscCode;
	long aadhaarNo;
	String pan;
	String traderLicence;
	String password;
	String cPassword;
	public Bidder() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	



	public Bidder(String email, String name, long contact, String address1, String address2, String city, String state,
			int pincode, long accountNo, String ifscCode, long aadhaarNo, String pan, String traderLicence,
			String password, String cPassword) {
		super();
		this.email = email;
		this.name = name;
		this.contact = contact;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.accountNo = accountNo;
		this.ifscCode = ifscCode;
		this.aadhaarNo = aadhaarNo;
		this.pan = pan;
		this.traderLicence = traderLicence;
		this.password = password;
		this.cPassword = cPassword;
	}





	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public long getAadhaarNo() {
		return aadhaarNo;
	}
	public void setAadhaarNo(long aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	
	public String getTraderLicence() {
		return traderLicence;
	}

	public void setTraderLicence(String traderLicence) {
		this.traderLicence = traderLicence;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getcPassword() {
		return cPassword;
	}


	public void setcPassword(String cPassword) {
		this.cPassword = cPassword;
	}

	@Override
	public String toString() {
		return "Bidder [email=" + email + ", name=" + name + ", contact=" + contact + ", address1=" + address1
				+ ", address2=" + address2 + ", city=" + city + ", state=" + state + ", pincode=" + pincode
				+ ", accountNo=" + accountNo + ", ifscCode=" + ifscCode + ", aadhaarNo=" + aadhaarNo + ", pan=" + pan
				+ ", traderLicence=" + traderLicence + ", password=" + password + ", cPassword=" + cPassword + "]";
	}

}
