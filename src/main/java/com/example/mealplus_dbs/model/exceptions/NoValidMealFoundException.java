package com.example.mealplus_dbs.model.exceptions;

public class NoValidMealFoundException extends Exception{

    public NoValidMealFoundException() {
        super("Meal is required");
    }
    public NoValidMealFoundException(String message) {
        super(message);
    }
}
