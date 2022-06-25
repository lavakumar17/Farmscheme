package com.example.demo.farm_scheme.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.farm_scheme.models.SellRequest;
import com.example.demo.farm_scheme.repositories.SellRequestRepo;

@Service
public class SellRequestService {
	
	@Autowired
	private SellRequestRepo sellRequestRepo;
	public void addSellRequest(SellRequest sellRequest) {
		sellRequestRepo.save(sellRequest);
	}
	public List<SellRequest> getAllSellRequests() {
		List<SellRequest> sellRequest = (List<SellRequest>) sellRequestRepo.findAll();
		return sellRequest;
	}

}
