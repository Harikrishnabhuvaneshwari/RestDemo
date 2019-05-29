package com.rest.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.demo.entity.Employee;

@RestController
@RequestMapping("/rest")
public class RestDemoController {

	@GetMapping("/hello")
	public String helloWorld(){
		return "Hello World";
	}
	
	@PostMapping(value="post/",consumes={"application/json"})
	private Employee postRequest(@RequestBody Employee employee){
		return employee;
	}
	
	
	
	

}
