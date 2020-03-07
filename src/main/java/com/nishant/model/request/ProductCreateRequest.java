package com.nishant.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ProductCreateRequest {

    @JsonProperty("name")
    private String name;

    @JsonProperty("count")
    private Long count;

    @JsonProperty("category_id")
    private Long categoryId;
}
