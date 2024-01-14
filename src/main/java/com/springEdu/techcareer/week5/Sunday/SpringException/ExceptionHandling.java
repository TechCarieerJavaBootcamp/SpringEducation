package com.springEdu.techcareer.week5.Sunday.SpringException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandling {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<String> methodExceptionHandler(Exception e){
        String message = "Exception" + e.getMessage();
        return new ResponseEntity<>(message, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(BusineessException.class)
    public ResponseEntity<String> businessExceptionHandler(BusineessException e){
        return new ResponseEntity<>("Business Hatası Oluştu.", HttpStatus.BAD_REQUEST);
    }

}
