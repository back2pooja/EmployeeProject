package com.kali.pk.exceptions;

public class DuplicateEmployeeException extends Exception {
	public static final long serialVersionUID = 1L;
	
		public DuplicateEmployeeException() {
			super();
		}
		public DuplicateEmployeeException(String errMsg) {
			super(errMsg);
		}

}
