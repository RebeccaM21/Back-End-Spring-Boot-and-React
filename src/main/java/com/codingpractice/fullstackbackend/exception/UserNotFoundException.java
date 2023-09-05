package com.codingpractice.fullstackbackend.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id) {
        super("Could not find user with this id " + id);
    }
}
