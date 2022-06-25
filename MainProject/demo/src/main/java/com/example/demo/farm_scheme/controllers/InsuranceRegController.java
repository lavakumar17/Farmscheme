package com.example.demo.farm_scheme.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.farm_scheme.models.InsuranceReg;
import com.example.demo.farm_scheme.services.InsuranceService;

@Controller
public class InsuranceRegController {
	
	@Autowired
	InsuranceService insuranceService;
	@GetMapping("/farmer/insuranceForm")
	public ModelAndView farmerInsuranceReg() {
		ModelAndView mv=new ModelAndView("/farmer/insurance_reg.jsp");
		mv.addObject("insurance", new InsuranceReg());
		return mv;
	}
	@PostMapping("/farmer/insuranceForm")
	public ModelAndView farmerInsuranceReg(@ModelAttribute("insurance") InsuranceReg insurance) {
		insurance.setCompany("Wipro");
		insurance.setPremiumAmount(100);
		insurance.setSharePremium(10);
		insurance.setSumInsuredPH(50);
		ModelAndView mv=new ModelAndView("/farmer/insurance_reg.jsp");
		//Integer policyNo=insuranceService.register(insurance);
		//mv.addObject("policyNo",policyNo);
		mv.addObject("insurance", insurance);
		return mv;
	}

}
