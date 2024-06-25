package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.ProcessedRequestDTO;
import com.example.demo.service.Deleteresttemplateservice;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class Deleteresttemplatecontroller {

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	ObjectMapper mapper;

	@Autowired
	public Deleteresttemplateservice deleteresttemplateservice;

	@DeleteMapping("/deleteCrew/{id}")
	public void deleteEmployee(@PathVariable String id) throws JsonProcessingException {
		ProcessedRequestDTO requestDTO = deleteRequest(id);
		String jsonRequest = mapper.writeValueAsString(requestDTO);
		System.out.println(jsonRequest);

		deleteresttemplateservice.deleteCrew(id);

	}

	private ProcessedRequestDTO deleteRequest(String id) {
		ProcessedRequestDTO delReq = new ProcessedRequestDTO();
		delReq.setCrewid(id);
		delReq.setOperationType("DELETE");
		return null;

	}

}
