package com.example.demo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Deleteresttemplateservice {

	RestTemplate resttemplate = new RestTemplate();
	final String URL = "http://dynamodbupdater/ddboperation";

	public void deleteCrew(String id) {
		Map<String, String> param = new HashMap<String, String>();
		param.put("crewid", id);
		resttemplate.delete(URL, param);

	}

}
