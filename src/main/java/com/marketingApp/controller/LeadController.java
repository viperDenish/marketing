package com.marketingApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketingApp.entity.Lead;
import com.marketingApp.service.LeadService;
import com.marketingApp.utility.EmailService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	
	@Autowired
	private EmailService emailService;
	
	//http://localhost:8080/view
	@RequestMapping("/view")
	public String viewLeadPage() {
		return "create_lead"; // Acts like Request Dispatcher
	}
	
	@RequestMapping("/saveLead")
	public String saveOneLead(Lead lead, Model model) {
	model.addAttribute("msg", "Data Saved")	;
	 leadService.saveLead(lead);
	 emailService.sendEmail(lead.getEmail(), "Sibu Chor", "Im sending this from my Java Application");
		return "create_lead";
	}
	
	@RequestMapping("/listall")
	public String getAllLead(Model model) {
		List<Lead> leads= leadService.getLeads();
		model.addAttribute("leads", leads);
		
		return "list_leads";
	}
	
	@RequestMapping("/deleteLead")
	public String deleteLead(Model model, @RequestParam("id") long id) {
		
		leadService.deleteLead(id);
		List<Lead> leads= leadService.getLeads();
		model.addAttribute("leads", leads);
		
		return "list_leads";
	}
	
	@RequestMapping("/updateLead")
	public String getLeadById(@RequestParam("id") long id, Model model) {
		
		Lead lead = leadService.getLeadById(id);
		model.addAttribute("lead", lead);
		
		return "update_leads";
		
	}
	
	@RequestMapping("/updatedLead")
	public String updateLead(Lead lead, Model model) {
		leadService.saveLead(lead);
		
		List<Lead> leads= leadService.getLeads();
		model.addAttribute("leads", leads);
		
		return "list_leads";
		
	}

}
