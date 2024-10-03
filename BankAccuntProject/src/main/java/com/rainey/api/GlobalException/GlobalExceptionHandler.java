package com.rainey.api.GlobalException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.rainey.api.Exception.InsufficientDepositException;

@ControllerAdvice
public class GlobalExceptionHandler {
	  @ExceptionHandler(InsufficientDepositException.class)
	  public ResponseEntity<String> handleInsufficientDepositException(InsufficientDepositException e) {
	        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
	    }
}
