package com.mycompany.spring_rest_application.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomErrorHandler {
	@ExceptionHandler
	public ResponseEntity<CustomErrorResponse> handleCustomerNotFoundException(CustomerNotFoundException cnfe) {
		CustomErrorResponse error = new CustomErrorResponse(HttpStatus.NOT_FOUND.value(),cnfe.getMessage(),System.currentTimeMillis());
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND) ;
		
	}
	@ExceptionHandler
	public ResponseEntity<CustomErrorResponse> handleCustomerNotFoundException(Exception e) {
		CustomErrorResponse error = new CustomErrorResponse(HttpStatus.NOT_FOUND.value(),e.getMessage(),System.currentTimeMillis());
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND) ;
		
	}
}
