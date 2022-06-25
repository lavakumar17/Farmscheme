package com.example.demo.farm_scheme.services;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.farm_scheme.models.InsuranceClaim;
import com.example.demo.farm_scheme.repositories.InsuranceClaimRepo;

@Service
public class InsuranceClaimService {
	
	@Autowired
	private InsuranceClaimRepo insuranceClaimRepo;
	
	public boolean insuranceClaim(InsuranceClaim insuranceClaim) {
		InsuranceClaim insuranceClaim2=insuranceClaimRepo.findById(insuranceClaim.getPolicyNo()).orElse(null);
		if(!Objects.nonNull(insuranceClaim2)) {
			insuranceClaimRepo.save(insuranceClaim);
			return true;
		}
		else
			return false;
	}

}
