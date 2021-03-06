package com.example.demo.farm_scheme.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.farm_scheme.models.InsuranceClaim;
import com.example.demo.farm_scheme.services.InsuranceClaimService;

@RestController
public class InsuranceClaimController {

	@Autowired
	InsuranceClaimService insuranceClaimService;

	@GetMapping("/farmer/insuranceClaim")
	public ModelAndView insuranceClaim(){
		ModelAndView mv=new ModelAndView("/farmer/insurance-claim.jsp");
		mv.addObject("insuranceClaim", new InsuranceClaim());
		return mv;
		
	}
	
	@PostMapping("/farmer/insuranceClaim")
	public ModelAndView insuranceClaim(@ModelAttribute("insuranceClaim") InsuranceClaim insuranceClaim) {
		
		ModelAndView mv=new ModelAndView("/farmer/insurance-claim.jsp");
		if(insuranceClaimService.insuranceClaim(insuranceClaim)) {
			mv.addObject("success", "Request Raised Successfully");
		}
		else
			mv.addObject("failed", "Insurance is already Claimed");
		return mv;
	}
	
}
