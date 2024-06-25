package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.Deleteresttemplateservice;

@RestController
public class Deleteresttemplatecontroller {
	
	@Autowired
	public Deleteresttemplateservice deleteresttemplateservice;
	
	@DeleteMapping("/deleteCrew/{id}")
	public void deleteEmployee(@PathVariable int id) {
		
		deleteresttemplateservice.deleteCrew(id);
		
	}

}
