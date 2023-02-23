package com.ragu.exception;

public class NoSuchEmployeeExistException extends RuntimeException {
	private final String errorMessage;

	

	public NoSuchEmployeeExistException(String errorMessage) {
		super(errorMessage);
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage()
	{
		return errorMessage;
	}

	
}
