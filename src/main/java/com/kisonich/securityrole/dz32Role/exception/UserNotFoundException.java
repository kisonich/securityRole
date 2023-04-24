package com.kisonich.securityrole.dz32Role.exception;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(long userId) {
        super("User not found with ID: " + userId);
    }
}