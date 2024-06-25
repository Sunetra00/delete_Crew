package com.example.demo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Deleteresttemplateservice {

	RestTemplate resttemplate = new RestTemplate();
	final String URL = "/ddboperation";

	public void deleteCrew(int id) {
		Map<String, Integer> param = new HashMap<String, Integer>();
		param.put("crewid", id);
		resttemplate.delete(URL, param);

	}

}
