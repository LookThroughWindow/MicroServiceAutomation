package com.learn.automation.restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class LocationServiceTestSuite {
	public static final String API_KEY = "XDCpTNAGxyGuGLduGGTGhGGm2Nhbw6U3";

	public static final String BASE_URL = "http://dataservice.accuweather.com/locations/v1/";
	
	public static final String ADMIN_AREAS_URL = "adminareas/";
	
	public static final String[] Countries = {"US", "IN", "UK"};
	
	public static final String FILLER = "&language=en-us&offset=0";
	
	@Test
	public void testAdminAreasService () {
		String URL = new StringBuffer (BASE_URL + ADMIN_AREAS_URL + Countries[0] + "?apikey=" +  API_KEY + FILLER).toString();
		System.out.println(" URL " + URL);
		Response response = RestAssured.get(URL );
		System.out.println(response.getBody());
	}
		
}
