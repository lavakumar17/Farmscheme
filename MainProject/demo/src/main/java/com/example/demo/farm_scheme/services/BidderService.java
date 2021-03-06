package com.example.demo.farm_scheme.services;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.example.demo.farm_scheme.models.Bidder;
import com.example.demo.farm_scheme.models.Roles;
import com.example.demo.farm_scheme.repositories.BidderRepo;

@Service
public class BidderService {
	
	@Autowired
	RolesService rolesService;

	@Autowired
	private BidderRepo bidderRepo;

	public Bidder adminLogin(String email) {
		Bidder bidder = bidderRepo.findById(email).orElse(null);
		return bidder;
	}

	public boolean addBidder(Bidder bidder) {
		// TODO Auto-generated method stub
		Bidder cbidder = bidderRepo.findById(bidder.getEmail()).orElse(null);
		if (!Objects.nonNull(cbidder)) {
			String pw = BCrypt.hashpw(bidder.getPassword(), BCrypt.gensalt());
			bidder.setcPassword(pw);
			bidder.setPassword(pw);
			bidderRepo.save(bidder);
			Roles roles = new Roles(bidder.getEmail(), "BIDDER");
			rolesService.addRoles(roles);
			return true;
		} else
			return false;

	}

}
