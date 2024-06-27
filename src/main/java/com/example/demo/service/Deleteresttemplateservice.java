package com.example.demo.service;

import java.util.HashMap;
import java.util.Map;

import com.example.demo.entity.Crew;
import com.example.demo.entity.ProcessedRequestDTO;
import com.example.demo.entity.Response;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Deleteresttemplateservice {

	@Autowired
	ObjectMapper mapper;

	@Autowired
	RestTemplate restTemplate;
	final String URL = "http://dynamodbupdater/ddboperation";

	public void deleteCrew(String id) throws JsonProcessingException {
		ProcessedRequestDTO requestDTO = deleteRequest(id);
		String jsonRequest = mapper.writeValueAsString(requestDTO);
		System.out.println(jsonRequest);
		HttpEntity request = new HttpEntity<>(requestDTO);
		ResponseEntity<Response> response = restTemplate.exchange(URL, HttpMethod.POST,request, Response.class);
	}

	private ProcessedRequestDTO deleteRequest(String id) {
		ProcessedRequestDTO
				requestDTO = new ProcessedRequestDTO();
		requestDTO.setCrewid(id);
		requestDTO.setOperationType("DELETE");
		return requestDTO;
	}

}
