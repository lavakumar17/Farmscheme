package com.example.demo.farm_scheme.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.farm_scheme.models.InsuranceReg;
import com.example.demo.farm_scheme.repositories.InsuranceRepo;
@Service
public class InsuranceService {

	@Autowired
	private InsuranceRepo insuranceRepo;
	
	public Integer register(InsuranceReg insurance) {
		
		insuranceRepo.save(insurance);
		return insurance.getPolicyNo();
		
		
	}
	
	
}
