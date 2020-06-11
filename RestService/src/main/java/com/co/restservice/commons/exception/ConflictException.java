package com.co.restservice.commons.exception;

/**
 * @author Orlando Velasquez
 */
public class ConflictException extends Exception {

    private Exception ex;

    public ConflictException(String message) {
        super(message);
    }

}
