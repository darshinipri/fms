package com.onebil.fms.test;

import org.json.simple.JSONObject;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


class ProductTest {

	@BeforeClass
	public static void init() {
	RestAssured.baseURI = "http://localhost";
	RestAssured.port = 8080;
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testaddProducts() {

	RequestSpecification request = RestAssured.given();

	JSONObject requestParams = new JSONObject();
	requestParams.put("productName", "Mobile Recharge");
//	requestParams.put("productId",1);
	requestParams.put("companyName","Airtel");

	request.header("Content-Type", "application/json");
	request.body(requestParams.toJSONString());
	Response response = request.post("/fms/product");	
    int statusCode = response.getStatusCode();
	Assert.assertEquals(statusCode,200);
	System.out.println("Response body: " + response.body().asString());
	}

//	@SuppressWarnings("unchecked")
//	@Test
//	public void testaddproductplan() {
//
//	RequestSpecification request = RestAssured.given();
//
//	JSONObject requestParams = new JSONObject();
//	requestParams.put("planId",1);
//	requestParams.put("planName", "truly unlimited");
//	requestParams.put("planType", "data plan");
//
//	request.header("Content-Type", "application/json");
//	request.body(requestParams.toJSONString());
//
//	Response response = request.post("/plan");
//	int statusCode = response.getStatusCode();
//	Assert.assertEquals(statusCode,200);
//	System.out.println("Response body: " + response.body().asString());
//
//	}

//	@SuppressWarnings("unchecked")
//	@Test
//	public void testaddPlan() {
//
//	RequestSpecification request = RestAssured.given();
//
//	JSONObject requestParams = new JSONObject();
//	requestParams.put("planName", "Virender");
//	requestParams.put("planDescription", "goa");
//	requestParams.put("startDate", "2020-12-12");
//
//
//	request.header("Content-Type", "application/json");
//	request.body(requestParams.toJSONString());
//
//	Response response = request.post("/CustomizePlan/plans");
//	int statusCode = response.getStatusCode();
//	Assert.assertEquals(statusCode,200);
//
//	System.out.println("Response body: " + response.body().asString());
//
//	}

}
