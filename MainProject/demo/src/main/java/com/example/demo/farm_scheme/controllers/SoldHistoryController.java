package com.example.demo.farm_scheme.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.farm_scheme.repositories.SellRequestRepo;
import com.example.demo.farm_scheme.services.SellRequestService;

@RestController
public class SoldHistoryController {
	
	@Autowired
	private SellRequestService sellRequestService;
	
	@PostMapping("/farmer/soldHistory")
	public ModelAndView soldHistory() {
		
		ModelAndView mv=new ModelAndView("/farmer/sold_history.jsp");
		mv.addObject("sellRequest", sellRequestService.getAllSellRequests());
		return mv;
		
	}

}
