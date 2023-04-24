package com.kisonich.securityrole.dz32Role.exception;

public class BookNotFoundException extends Exception {
    public BookNotFoundException(long id) {
        super("Book not found with ID: " + id);

    }
}
