package com.mphasis.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.mphasis.model.ErrorInfo;

@RestControllerAdvice
public class ExceptionController {
	@ExceptionHandler(CreaditLimitException.class)
	public ResponseEntity<ErrorInfo> handleCreaditLImitException(CreaditLimitException ex){
		ErrorInfo info= new ErrorInfo();
		info.setDate(LocalDateTime.now());
		info.setMsg(ex.getMessage());
		info.setStatus(400);
		return new ResponseEntity<ErrorInfo>(info,HttpStatus.BAD_REQUEST); 
	}

}
