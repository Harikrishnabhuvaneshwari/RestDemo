package com.rest.demo.controller;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.junit.Test;

public class EmployeeRestControllerTest{

	Client client=ClientBuilder.newClient();
	@Test
	public void test(){
		WebTarget target=client.target("http://localhost:8080/RestDemo/rest/hello");
		String response=target.request().get(String.class);
		System.out.println(response);
	}

}
