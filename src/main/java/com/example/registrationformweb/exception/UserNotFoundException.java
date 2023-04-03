package com.example.registrationformweb.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("Could not found the user by id" + id);
    }
}
