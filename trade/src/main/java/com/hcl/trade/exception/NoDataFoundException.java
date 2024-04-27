package com.hcl.trade.exception;

public class NoDataFoundException extends RuntimeException {
    public NoDataFoundException (String id){
        super(id);
    }
}
