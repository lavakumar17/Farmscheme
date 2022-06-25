package com.example.demo.farm_scheme.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.farm_scheme.services.SellRequestService;

@RestController
public class BidAmountController {
	
	@Autowired
	private SellRequestService sellRequestService;
	
	@GetMapping("/bidder/bidAmount")
	public ModelAndView bidAmount() {
		ModelAndView mv=new ModelAndView("/bidder/bidding.jsp");
		mv.addObject("sellRequest", sellRequestService.getAllSellRequests());
		mv.addObject("cBid", 1000);
		return mv;
	}
	
	@PostMapping("/bidder/bidAmount")
	public ModelAndView bidAmount(@RequestParam("bidAmount") String bidAmount) {
		ModelAndView mv=new ModelAndView("/bidder/bidding.jsp");
		mv.addObject("sellRequest", sellRequestService.getAllSellRequests());
		mv.addObject("cBid", bidAmount);
		return mv;
	}

}
