package com.rest.demo.rest;

public class EmployeeNotFoundException extends RuntimeException{

	public EmployeeNotFoundException() {
		super();
	}

	public EmployeeNotFoundException(String message) {
		super(message);
	}

}
