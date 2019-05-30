package com.rest.demo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<EmployeeErrorResponse> handleException(EmployeeNotFoundException exception){
		EmployeeErrorResponse response=new EmployeeErrorResponse();
		response.setStatusCode(HttpStatus.NOT_FOUND.value());
		response.setErrorMessage(exception.getMessage());
		response.setTime(System.currentTimeMillis());
		return new ResponseEntity<EmployeeErrorResponse>(response,HttpStatus.NOT_FOUND);
	}

	//generic exception handler
	@ExceptionHandler
	public ResponseEntity<EmployeeErrorResponse> handleException(Exception exception){
		EmployeeErrorResponse response=new EmployeeErrorResponse();
		response.setStatusCode(HttpStatus.BAD_REQUEST.value());
		response.setErrorMessage(exception.getMessage());
		response.setTime(System.currentTimeMillis());
		return new ResponseEntity<EmployeeErrorResponse>(response,HttpStatus.BAD_REQUEST) ;
	}
}
