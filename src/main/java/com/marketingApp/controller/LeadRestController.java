package com.marketingApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marketingApp.dto.LeadDto;
import com.marketingApp.entity.Lead;
import com.marketingApp.repository.LeadRepository;

@RestController
@RequestMapping("/api/leads")
public class LeadRestController {

	@Autowired
	private LeadRepository leadRepo;
	
	@GetMapping
	public List<Lead> getAllLeads(){
		
		List<Lead> leads = leadRepo.findAll();//java object
		return leads;
	}
	
	@PostMapping
	public void createLead(@RequestBody Lead lead) {
		leadRepo.save(lead);
	}
	
	//http://localhost:8080/api/leads/7
	@DeleteMapping("{id}")
	public void deleteLead(@PathVariable("id") long id) {
		
		leadRepo.deleteById(id);
		
	}
	
	@PutMapping("{id}")
	public void updateLead(@PathVariable("id") long id, @RequestBody LeadDto dto) {
		
		Lead lead= new Lead();
		lead.setId(id);
		lead.setFirstName(dto.getFirstName());
		lead.setLastName(dto.getLastName());
		lead.setEmail(dto.getEmail());
		lead.setPhone(dto.getPhone());
		
		leadRepo.save(lead);
		
		
	}
}









