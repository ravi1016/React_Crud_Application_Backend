package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
	/*
	 Whenever a record is not available in database then RESTapi will send an 
	 Exception(ResourceNotFoundException) and we have annotated this exception with 
	 @ResponseStatus annotation so API will return NOT FOUND Status to the client.
	 */
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(String message) {
		super(message);
	}

}
