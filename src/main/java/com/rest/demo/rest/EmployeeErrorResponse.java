package com.rest.demo.rest;

public class EmployeeErrorResponse {
	private int statusCode;
	private String errorMessage;
	private long time;

	public EmployeeErrorResponse() {

	}
	
	public EmployeeErrorResponse(int statusCode, String errorMessage, long time) {
		this.statusCode = statusCode;
		this.errorMessage = errorMessage;
		this.time = time;
	}



	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}

}
