package com.kali.pk.exceptions;

public class EmployeeNotFoundException extends Exception {
	
	public EmployeeNotFoundException() {
		super();
	}
	public EmployeeNotFoundException(String errMsg) {
		super(errMsg);
	}
	public EmployeeNotFoundException(Exception e) {
		super(e);
	}

}
