package com.example.demo.farm_scheme.services;


import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.example.demo.farm_scheme.models.Farmer;
import com.example.demo.farm_scheme.models.Roles;
import com.example.demo.farm_scheme.repositories.FarmerRepo;

@Service
public class FarmerService {

	@Autowired
	private FarmerRepo farmerRepo;
	
	@Autowired
	private RolesService rolesService;
	
	public Farmer adminLogin(String email) {
		Farmer farmer=farmerRepo.findById(email).orElse(null);
		return farmer;
	}

	public boolean addFarmer(Farmer farmer) {
		// TODO Auto-generated method stub
		Farmer cFarmer=farmerRepo.findById(farmer.getEmail()).orElse(null);
		if(!Objects.nonNull(cFarmer)) {
			String pw=BCrypt.hashpw(farmer.getPassword(), BCrypt.gensalt());
			farmer.setcPassword(pw);
			farmer.setPassword(pw);
			farmerRepo.save(farmer);
			Roles roles=new Roles(farmer.getEmail(),"FARMER");
			rolesService.addRoles(roles);
			return true;
		}
		else
			return false;
		
	}
	
}
