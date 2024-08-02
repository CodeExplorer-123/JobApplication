package com.embarkx.firstjobapp.exception;

import jakarta.persistence.Entity;
import org.springframework.stereotype.Component;


public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
