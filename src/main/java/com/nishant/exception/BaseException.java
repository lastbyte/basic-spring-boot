package com.nishant.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class BaseException  extends Exception{
    private String message;
    private String status;
    private Integer code;

    public BaseException(final String status, final Integer code,final String message){
        super(message);
        this.status = status;
        this.code = code;
        this.message = message;
    }
}
