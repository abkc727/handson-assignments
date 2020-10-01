package com.hsbc.exception;

public class ProfileNotFoundException extends Exception{
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ProfileNotFoundException() {
		
		super("Sorry, profile not found!");
		
	}

	public ProfileNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	

}
