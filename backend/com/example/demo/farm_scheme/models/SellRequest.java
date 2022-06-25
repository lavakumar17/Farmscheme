package com.example.demo.farm_scheme.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class SellRequest {
	@Id
@SequenceGenerator(
			
			name="id",
			sequenceName="id",
			allocationSize=1
			
			)
	@GeneratedValue(
			strategy=GenerationType.SEQUENCE,
			generator="id"
			)
	private int id;
	String cropType;
	String cropName;
	String fertilizerType;
	long quantity;
	String soilPhCertificate;
	
	public SellRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SellRequest(String cropType, String cropName, String fertilizerType, long quantity,
			String soilPhCertificate) {
		super();
		this.cropType = cropType;
		this.cropName = cropName;
		this.fertilizerType = fertilizerType;
		this.quantity = quantity;
		this.soilPhCertificate = soilPhCertificate;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCropType() {
		return cropType;
	}
	public void setCropType(String cropType) {
		this.cropType = cropType;
	}
	public String getCropName() {
		return cropName;
	}
	public void setCropName(String cropName) {
		this.cropName = cropName;
	}
	public String getFertilizerType() {
		return fertilizerType;
	}
	public void setFertilizerType(String fertilizerType) {
		this.fertilizerType = fertilizerType;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public String getSoilPhCertificate() {
		return soilPhCertificate;
	}
	public void setSoilPhCertificate(String soilPhCertificate) {
		this.soilPhCertificate = soilPhCertificate;
	}

	@Override
	public String toString() {
		return "SellRequest [id=" + id + ", cropType=" + cropType + ", cropName=" + cropName + ", fertilizerType="
				+ fertilizerType + ", quantity=" + quantity + ", soilPhCertificate=" + soilPhCertificate + "]";
	}
	
	

}
