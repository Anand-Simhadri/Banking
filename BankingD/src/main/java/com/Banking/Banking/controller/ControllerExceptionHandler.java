package com.Banking.Banking.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.Banking.Banking.exception.NoFundsException;

@ControllerAdvice
public class ControllerExceptionHandler  extends ResponseEntityExceptionHandler {
	@ExceptionHandler
	public ResponseEntity<Object> handleProductNotFound(NoFundsException ex, WebRequest request) {

		Map<String, Object> body = new LinkedHashMap<>();
		body.put("status", "failure");
		body.put("message", "Funds not available");
		return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
	}

	
}
