package com.example.demo.farm_scheme.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InsuranceClaim {
	
	@Id
	private int policyNo;
	private String company;
	private String nameOfInsuree;
	private long sumInsured;
	private String causeForLoss;
	private Date dateOfLoss;
	private String supportingDocs;
	public InsuranceClaim() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InsuranceClaim(int policyNo, String company, String nameOfInsuree, long sumInsured, String causeForLoss,
			Date dateOfLoss, String supportingDocs) {
		super();
		this.policyNo = policyNo;
		this.company = company;
		this.nameOfInsuree = nameOfInsuree;
		this.sumInsured = sumInsured;
		this.causeForLoss = causeForLoss;
		this.dateOfLoss = dateOfLoss;
		this.supportingDocs = supportingDocs;
	}
	public int getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(int policyNo) {
		this.policyNo = policyNo;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getNameOfInsuree() {
		return nameOfInsuree;
	}
	public void setNameOfInsuree(String nameOfInsuree) {
		this.nameOfInsuree = nameOfInsuree;
	}
	public long getSumInsured() {
		return sumInsured;
	}
	public void setSumInsured(long sumInsured) {
		this.sumInsured = sumInsured;
	}
	public String getCauseForLoss() {
		return causeForLoss;
	}
	public void setCauseForLoss(String causeForLoss) {
		this.causeForLoss = causeForLoss;
	}
	public Date getDateOfLoss() {
		return dateOfLoss;
	}
	public void setDateOfLoss(Date dateOfLoss) {
		this.dateOfLoss = dateOfLoss;
	}
	public String getSupportingDocs() {
		return supportingDocs;
	}
	public void setSupportingDocs(String supportingDocs) {
		this.supportingDocs = supportingDocs;
	}
	@Override
	public String toString() {
		return "InsuranceClaim [policyNo=" + policyNo + ", company=" + company + ", nameOfInsuree=" + nameOfInsuree
				+ ", sumInsured=" + sumInsured + ", causeForLoss=" + causeForLoss + ", dateOfLoss=" + dateOfLoss
				+ ", supportingDocs=" + supportingDocs + "]";
	}
	

}
