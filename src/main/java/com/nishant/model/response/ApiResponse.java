package com.nishant.model.response;

import com.nishant.model.common.ApiError;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ApiResponse<T> {

    private T payload;
    private String message;
    private ApiError error;
    private Boolean status;

    public ApiResponse(final T object){
        this.payload = object;
    }

}
