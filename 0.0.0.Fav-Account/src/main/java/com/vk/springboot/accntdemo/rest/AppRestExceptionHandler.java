package com.vk.springboot.accntdemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppRestExceptionHandler {
	
	// add an exception handler using @ExceptionHandler
	
	@ExceptionHandler
	public ResponseEntity<AccountErrorResponse> handleException(NoDataFoundException exc)
	{
		//create a StudentErrorResponse
		AccountErrorResponse error = new AccountErrorResponse();
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(exc.getMessage());
		error.setTimestamp(System.currentTimeMillis());
		
		return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
	}
	
	
	// add another exeception handler ... to catch any exception
	@ExceptionHandler
	public ResponseEntity<AccountErrorResponse> handleException(Exception exc)
	{
		//create a StudentErrorResponse
		AccountErrorResponse error = new AccountErrorResponse();
				error.setStatus(HttpStatus.BAD_REQUEST.value());
				error.setMessage(exc.getMessage());
				error.setTimestamp(System.currentTimeMillis());
				
				return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
	}

}
