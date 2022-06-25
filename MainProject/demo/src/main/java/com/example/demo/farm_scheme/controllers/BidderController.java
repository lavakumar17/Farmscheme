package com.example.demo.farm_scheme.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.farm_scheme.models.Bidder;
import com.example.demo.farm_scheme.services.BidderService;

@RestController
public class BidderController {
	
	@Autowired
	BidderService bidderService;
	
	@GetMapping("/bidder/registration")
	public ModelAndView bidderReg() {
		ModelAndView mv=new ModelAndView("/bidder/bidder_reg.jsp");
		mv.addObject("bidder",new Bidder());
		return mv;
	}
	
	@PostMapping("/bidder/registration")
	public ModelAndView bidderReg(@ModelAttribute("bidder") Bidder bidder) {
		ModelAndView mv=new ModelAndView("/bidder/bidder_reg.jsp");
		if(bidderService.addBidder(bidder)) {
			mv.addObject("success", "Bidder added successfully");
		}
		else {
			mv.addObject("failed", "Email Id already exists");
		}
		return mv;
	}

}
