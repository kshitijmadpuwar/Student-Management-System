package com.example.demo.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandller {

	@ExceptionHandler(StudentNotFoundException.class)
	public String StudentNotFoundException(StudentNotFoundException ex) {
		 return ex.getMessage();
	}
	
	@ExceptionHandler(Exception.class)
	public String handleAll(Exception ex) {
		 return "Something Went Wrong...!!!";
	}
}
