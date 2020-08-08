package com.example.springbootfeign.exception;

@SuppressWarnings("serial")
public class InvalidSessionIdException extends RuntimeException {

	public InvalidSessionIdException(String message) {
		super(message);
	}
}
