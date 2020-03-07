package com.nishant.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nishant.entity.Product;
import com.nishant.model.request.ProductCreateRequest;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class ProductMapper {

    private final ModelMapper mapper;

    public Product MapToEntity(final ProductCreateRequest request){
        final Product product = mapper.map(request, Product.class);
        return product;
    }
}
