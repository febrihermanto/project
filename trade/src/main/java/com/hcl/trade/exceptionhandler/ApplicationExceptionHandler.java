package com.hcl.trade.exceptionhandler;

import com.hcl.trade.exception.NoDataFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ApplicationExceptionHandler {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NoDataFoundException.class)
    public String handleNoDataFoundException(NoDataFoundException noDataFoundException){
        return  noDataFoundException.getMessage() + " is not found";
    }
}