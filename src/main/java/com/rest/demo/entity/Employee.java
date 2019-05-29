package com.rest.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)   //used to ignore unknown properties if any
//present in the JSON data.
public class Employee {
	private int empId;
	private String empName;
	private int empSalary;
	private List<String> languagesKnown;


	@Override
	public String toString() {
		return "empId :"+empId+" empName : "+empName+" empSalary : "+empSalary
				+" languagesKnown : "+languagesKnown;
	}

	public int getEmpId() {
		System.out.println("Woooohh I'm called by jackson.......");
		return empId;
	}
	public void setEmpId(int empId) {
		System.out.println("Woooohh I'm called by jackson.......");
		this.empId = empId;
	}
	public String getEmpName() {
		System.out.println("Woooohh I'm called by jackson.......");
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
		System.out.println("Woooohh I'm called by jackson.......");
	}
	public int getEmpSalary() {
		System.out.println("Woooohh I'm called by jackson.......");
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
		System.out.println("Woooohh I'm called by jackson.......");
	}
	public List<String> getLanguagesKnown() {
		System.out.println("Woooohh I'm called by jackson.......");
		return languagesKnown;
		
	}
	public void setLanguagesKnown(List<String> languagesKnown) {
		this.languagesKnown = languagesKnown;
		System.out.println("Woooohh I'm called by jackson.......");
	}


}
