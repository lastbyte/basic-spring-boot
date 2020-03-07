package com.nishant.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
public class ApiRequest<T> {

    @JsonProperty("payload")
    private T payload;

    @JsonProperty("timestamp")
    private Instant timestamp;

    public ApiRequest(final T payload){
        this.payload = payload;
    }
}
