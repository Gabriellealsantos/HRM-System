package com.inovals.HRMSystem.controllers.exceptions;

import com.inovals.HRMSystem.controllers.handlers.StandardError;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {

    public ValidationError(Instant timestamp, Integer status, String error, String message, String path) {
        super(timestamp, status, error, message, path);
    }
    
    private List<FieldMessage> errors = new ArrayList<>();


    public List<FieldMessage> getErrors() {
        return errors;
    }

    public void addError(String fieldName, String message) {
        errors.add(new FieldMessage(fieldName, message));
    }
}
