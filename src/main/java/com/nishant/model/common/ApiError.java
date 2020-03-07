package com.nishant.model.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class ApiError implements Serializable {
    private String code;
    private String msg;
    private String status;
}
