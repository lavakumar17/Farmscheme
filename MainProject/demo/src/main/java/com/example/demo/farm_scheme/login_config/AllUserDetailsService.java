package com.example.demo.farm_scheme.login_config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.farm_scheme.models.Admin;
import com.example.demo.farm_scheme.models.Bidder;
import com.example.demo.farm_scheme.models.Farmer;
import com.example.demo.farm_scheme.models.Roles;
import com.example.demo.farm_scheme.repositories.AdminRepo;
import com.example.demo.farm_scheme.repositories.BidderRepo;
import com.example.demo.farm_scheme.repositories.FarmerRepo;
import com.example.demo.farm_scheme.repositories.RolesRepo;

@Service
public class AllUserDetailsService implements UserDetailsService {
	
	@Autowired
	BidderRepo bidderRepo;
	
	@Autowired
	RolesRepo rolesRepo;
	
	@Autowired
	AdminRepo adminRepo;
	
	@Autowired
	FarmerRepo farmerRepo;

	
	@Override
	public UserDetails loadUserByUsername(String emailId) throws UsernameNotFoundException {
		
		
		Roles roles=rolesRepo.findById(emailId).orElse(null);
		System.out.println(emailId);
		UserDetails user=null;
		if(roles==null) {
			throw new UsernameNotFoundException("User Not Found");
		}
		else if(roles.getRole().equalsIgnoreCase("ADMIN")) {
			
			Admin admin=adminRepo.findById(emailId).orElse(null);
			if(admin==null)
				throw new UsernameNotFoundException("User Not Found");
		user = User.withUsername(admin.getEmailId()).password(admin.getPassword()).authorities("ADMIN").roles("ADMIN").build();
			
		}
		else if(roles.getRole().equalsIgnoreCase("BIDDER")) {
		
			Bidder bidder=bidderRepo.findById(emailId).orElse(null);
			if(bidder==null)
				throw new UsernameNotFoundException("User Not Found");
			user=User.withUsername(bidder.getEmail()).password(bidder.getPassword()).authorities("BIDDER").roles("BIDDER").build();
		
		}
		else if(roles.getRole().equalsIgnoreCase("FARMER")) {
			
			Farmer farmer=farmerRepo.findById(emailId).orElse(null);
			if(farmer==null)
				throw new UsernameNotFoundException("User Not Found");
			user=User.withUsername(farmer.getEmail()).password(farmer.getPassword()).authorities("FARMER").roles("FARMER").build();
		
		}
		return user;
		
	}

}
