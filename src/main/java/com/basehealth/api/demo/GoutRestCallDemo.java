package com.basehealth.api.demo;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

/**
 * This is a sample app that demostrates how to make healthbase plus api calls.
 * This class demonstrates how to make a post request along with custom request headers
 * and JSON request body.
 * 
 * Following demonstration uses Spring Framework. 
 */
public class GoutRestCallDemo {

	public static final String API_URI = "http://api.basehealth.com/Genophen/api/v1/assessment/diseases/gout";
	public static final String USER_KEY = "" + /*ENtER user_key here*/ "";
	
	public static void main(String[] args) {
		
		//Populate POJO to be used for request body
		GoutInputRequest goutInputRequest = createGoutParams();
		
		RestTemplate restTemplate = new RestTemplate();
		
		//Set appropriate request headers
		HttpHeaders requestHeaders = createHttpHeaders();
		
		HttpEntity entity = new HttpEntity(goutInputRequest, requestHeaders);
		
		HttpEntity<GoutResponse> response;
		
		try {
			//Response is mapped to POJO representing JSON response.
			response = restTemplate.exchange(API_URI, HttpMethod.POST, entity, GoutResponse.class);
			System.out.println(response.getBody());
			
		} catch (RestClientException e) {
			
			System.out.println(e.getMessage());
			
		}
	
	}

	private static HttpHeaders createHttpHeaders() {
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("user_key", USER_KEY);
		return headers;
		
	}

	private static GoutInputRequest createGoutParams() {
		
		GoutInputRequest params = new GoutInputRequest();
		
		params.setAlcohol(new Alcohol("10", "4", "6"));
		params.setMedicinesTakenPast30Days(new MedicinesTaken("yes", "no"));
		params.setSystolicBloodPressure("120");
		params.setDiastolicBloodPressure("100");
		params.setEthnicity("unknown");
		params.setGender("female");
		params.setHeight("63.00");
		params.setWeight("123.40");
		params.setYearOfBirth("1996");
		
		return params;
		
	}
}