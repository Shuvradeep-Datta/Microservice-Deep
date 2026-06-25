package com.deep.Identity_Service.exception;

public class CustomTokenFailureException extends RuntimeException{

    public CustomTokenFailureException(String message) {
        super(message);
    }

}
