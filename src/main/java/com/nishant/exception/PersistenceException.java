package com.nishant.exception;


public class PersistenceException extends BaseException {

    public PersistenceException(final String status, final Integer code, final String message) {
        super(status, code, message);
    }
}
