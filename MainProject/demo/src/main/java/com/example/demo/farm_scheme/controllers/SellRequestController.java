package com.example.demo.farm_scheme.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.farm_scheme.models.SellRequest;
import com.example.demo.farm_scheme.repositories.SellRequestRepo;
import com.example.demo.farm_scheme.services.SellRequestService;

@RestController
public class SellRequestController {
	
	@Autowired
	private SellRequestService sellRequestService;
	
	@GetMapping("/farmer/sellRequest")
	public ModelAndView farmerSellRequest() {
		ModelAndView mv=new ModelAndView("/farmer/sell_request.jsp");
		mv.addObject("sellRequest",new SellRequest());
		return mv;
	}
	@PostMapping("/farmer/sellRequest")
	public ModelAndView farmerSellRequest(@ModelAttribute("sellRequest") SellRequest sellRequest) {
		ModelAndView mv=new ModelAndView("/farmer/sell_request.jsp");
		sellRequestService.addSellRequest(sellRequest);
		mv.addObject("success","Sell Request Placed Successfully");
		return mv;
	}

}
