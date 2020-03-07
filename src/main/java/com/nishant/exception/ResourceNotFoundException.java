package com.nishant.exception;

public class ResourceNotFoundException extends BaseException{
    public ResourceNotFoundException(final String status, final Integer code, final String message) {
        super(status, code, message);
    }
}
