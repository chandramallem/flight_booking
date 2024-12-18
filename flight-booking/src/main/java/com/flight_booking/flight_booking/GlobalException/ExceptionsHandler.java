package com.flight_booking.flight_booking.GlobalException;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.flight_booking.flight_booking.customresponce.CustomResponce;


@ControllerAdvice
public class ExceptionsHandler {
	
	@ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<CustomResponce> handleException(Exception ex) {
        CustomResponce errorResponse = new CustomResponce();
        errorResponse.setMessage(ex.getMessage());
        errorResponse.setStatus("error");
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
