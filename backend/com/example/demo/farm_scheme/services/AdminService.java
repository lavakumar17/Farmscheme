package com.example.demo.farm_scheme.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.farm_scheme.models.Admin;
import com.example.demo.farm_scheme.repositories.AdminRepo;

@Service
public class AdminService {

	@Autowired
	private AdminRepo adminRepo;
	
	public Admin adminLogin(String email) {
		Admin admin=adminRepo.findById(email).orElse(null);
		return admin;
	}
	
}
