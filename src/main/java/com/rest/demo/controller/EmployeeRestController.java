package com.rest.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.demo.entity.Employee;
import com.rest.demo.rest.EmployeeNotFoundException;

@RestController
@RequestMapping("/rest")
public class EmployeeRestController {

	private List<Employee> employees;

	@PostConstruct
	private void populateEmployee(){
		System.out.println("Post Constructing");
		employees=new ArrayList<>();
		employees.add(new Employee(1,"Goa Karthik",40000,Arrays.asList("Konkani","Tamil","English","Hindi")));
		employees.add(new Employee(2,"Hari",40000,Arrays.asList("Telugu","Tamil","English")));
	}

	@GetMapping("/hello")
	public String helloWorld(){
		return "Hello World";
	}

	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		return employees;
	}

	@GetMapping("/employees/{empId}")
	public Employee getEmployee(@PathVariable int empId){
		if(empId>employees.size()||empId<0){
			throw new EmployeeNotFoundException("Employee with id "+empId+" not found");
		}
		return employees.get(empId);
	}

	@PostMapping("/employees")
	public void createEmployee(@RequestBody Employee employee){
		employees.add(employee);
	}

}
