package com.sam.learningspring.error;

public class DataNotFoundException extends RuntimeException{
    public DataNotFoundException(Integer id) {
        super("Could not find employee " + id);
    }
}
