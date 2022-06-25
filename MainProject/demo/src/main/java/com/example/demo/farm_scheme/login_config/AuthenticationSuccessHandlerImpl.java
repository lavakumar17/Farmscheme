package com.example.demo.farm_scheme.login_config;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import com.example.demo.farm_scheme.models.Roles;
import com.example.demo.farm_scheme.repositories.AdminRepo;
import com.example.demo.farm_scheme.repositories.BidderRepo;
import com.example.demo.farm_scheme.repositories.FarmerRepo;
import com.example.demo.farm_scheme.repositories.RolesRepo;
import com.example.demo.farm_scheme.services.FarmerService;


@Component
public class AuthenticationSuccessHandlerImpl implements AuthenticationSuccessHandler {


	@Autowired
	FarmerService farmerService;
	@Autowired
	AdminRepo adminRepo;
	@Autowired
	FarmerRepo farmerRepo;
	@Autowired
	BidderRepo bidderRepo;
	@Autowired
	RolesRepo rolesRepo;
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
			
			Roles roles=rolesRepo.findById(request.getParameter("emailId")).orElse(null);
			request.getSession().setAttribute("emailId",request.getParameter("emailId"));
			if(roles.getRole().equalsIgnoreCase("ADMIN")) {
				request.getSession().setAttribute("rname", adminRepo.findById(request.getParameter("emailId")).orElse(null).getName());
				request.setAttribute("role", "Admin");
				response.sendRedirect("/admin/dashboard.jsp");
				
			}
			else if(roles.getRole().equalsIgnoreCase("BIDDER")) {
				request.getSession().setAttribute("rname", bidderRepo.findById(request.getParameter("emailId")).orElse(null).getName());
				request.setAttribute("role", "Bidder");
			response.sendRedirect("/bidder/dashboard.jsp");
			}
			else if(roles.getRole().equalsIgnoreCase("FARMER")) {
				request.getSession().setAttribute("rname", farmerRepo.findById(request.getParameter("emailId")).orElse(null).getName());
				request.setAttribute("role", "Farmer");
			response.sendRedirect("/farmer/dashboard.jsp");
			}
	}

}
