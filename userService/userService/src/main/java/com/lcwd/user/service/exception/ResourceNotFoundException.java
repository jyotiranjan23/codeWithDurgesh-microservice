package com.lcwd.user.service.exception;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(){
        super("Resource not found Server!!");
    }
    public ResourceNotFoundException(String message){
        super(message);
    }
}
