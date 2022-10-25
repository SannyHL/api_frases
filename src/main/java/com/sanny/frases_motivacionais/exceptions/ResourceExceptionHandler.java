package com.sanny.frases_motivacionais.exceptions;

import java.time.LocalDateTime;
import java.time.ZoneId;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResourceExceptionHandler {
    
    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException objectNotFoundException, HttpServletRequest request){

        var erro = new StandardError(LocalDateTime.now(ZoneId.of("UTC-3")), HttpStatus.NOT_FOUND.value(), objectNotFoundException.getMessage(), request.getRequestURI());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
    }
}
