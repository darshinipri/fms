package com.onebil.fms.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.onebil.fms.dto.ResponseDTO;
import com.onebil.fms.exception.PricingException;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(PricingException.class)

	public ResponseEntity<ResponseDTO> handler(PricingException e) {
		ResponseDTO response = new ResponseDTO();
		response.setError(true);
		response.setResponse(e.getLocalizedMessage());
		return new ResponseEntity<ResponseDTO>(response,HttpStatus.INTERNAL_SERVER_ERROR);
	}

}

