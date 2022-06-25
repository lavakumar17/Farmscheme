package com.example.demo.farm_scheme.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.farm_scheme.models.Roles;
import com.example.demo.farm_scheme.repositories.RolesRepo;

@Service
public class RolesService {
	
	@Autowired
	private RolesRepo rolesRepo;
	
	public void addRoles(Roles roles) {
		
		rolesRepo.save(roles);
		
	}
	

}
