package com.rainey.api.Exception;

public class InsufficientDepositException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InsufficientDepositException(String message) {
		super(message);
	}
}
