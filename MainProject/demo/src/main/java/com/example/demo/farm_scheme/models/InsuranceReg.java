package com.example.demo.farm_scheme.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class InsuranceReg {
	
	@Id
@SequenceGenerator(
			
			name="policy_no",
			sequenceName="policy_no",
			allocationSize=1
			
			)
	@GeneratedValue(
			strategy=GenerationType.SEQUENCE,
			generator="policy_no"
			)
	private int policyNo;
	private String season;
	private int year;
	private String crop;
	private double sumInsured;
	private int area;
	private String insuranceCompany;
	private double sharePremium;
	private double premiumAmount;
	private String company;
	private int sumInsuredPH;
	
	public InsuranceReg() {
		super();
		// TODO Auto-generated constructor stub
	}

	





	public InsuranceReg(int policyNo, String season, int year, String crop, double sumInsured, int area,
			String insuranceCompany, double sharePremium, double premiumAmount, String company, int sumInsuredPH) {
		super();
		this.policyNo = policyNo;
		this.season = season;
		this.year = year;
		this.crop = crop;
		this.sumInsured = sumInsured;
		this.area = area;
		this.insuranceCompany = insuranceCompany;
		this.sharePremium = sharePremium;
		this.premiumAmount = premiumAmount;
		this.company = company;
		this.sumInsuredPH = sumInsuredPH;
	}

	public int getSumInsuredPH() {
		return sumInsuredPH;
	}







	public void setSumInsuredPH(int sumInsuredPH) {
		this.sumInsuredPH = sumInsuredPH;
	}







	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getCrop() {
		return crop;
	}

	public void setCrop(String crop) {
		this.crop = crop;
	}

	public double getSumInsured() {
		return sumInsured;
	}

	public void setSumInsured(double sumInsured) {
		this.sumInsured = sumInsured;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public String getInsuranceCompany() {
		return insuranceCompany;
	}

	public void setInsuranceCompany(String insuranceCompany) {
		this.insuranceCompany = insuranceCompany;
	}

	public double getSharePremium() {
		return sharePremium;
	}

	public void setSharePremium(double sharePremium) {
		this.sharePremium = sharePremium;
	}

	public double getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(double premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public int getPolicyNo() {
		return policyNo;
	}

	@Override
	public String toString() {
		return "InsuranceReg [policyNo=" + policyNo + ", season=" + season + ", year=" + year + ", crop=" + crop
				+ ", sumInsured=" + sumInsured + ", area=" + area + ", insuranceCompany=" + insuranceCompany
				+ ", sharePremium=" + sharePremium + ", premiumAmount=" + premiumAmount + "]";
	}
		

}
