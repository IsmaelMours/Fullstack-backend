package com.ismael.fullstack.exception;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(Long id){

        super("User with the Id " + id + "  Could not be found");
    }
}
