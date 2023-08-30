package com.kali.pk.exceptions;

public class EmployeeClassNotFoundException extends Exception {
	public static final long serialVersionUID = 1L;
	
		public EmployeeClassNotFoundException() {
			super();
		} 
		public EmployeeClassNotFoundException(String Msg) {
			super(Msg);
		}
		public EmployeeClassNotFoundException(Exception e) {
			super(e);
		}
		

}
