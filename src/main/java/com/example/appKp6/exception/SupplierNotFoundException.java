package com.example.appKp6.exception;

public class SupplierNotFoundException extends RuntimeException {
    public SupplierNotFoundException(Long id){
        super("Could not found the supplier with id "+ id);
    }
}

