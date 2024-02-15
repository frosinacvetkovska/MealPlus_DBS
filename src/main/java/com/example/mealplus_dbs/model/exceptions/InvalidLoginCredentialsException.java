package com.example.mealplus_dbs.model.exceptions;

public class InvalidLoginCredentialsException extends Exception{
    public InvalidLoginCredentialsException() {
        super("Invalid Credentials!");
    }
}
