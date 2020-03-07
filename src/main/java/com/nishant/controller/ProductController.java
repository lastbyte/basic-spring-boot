package com.nishant.controller;

import com.nishant.entity.Category;
import com.nishant.entity.Product;
import com.nishant.mapper.ProductMapper;
import com.nishant.model.request.ApiRequest;
import com.nishant.model.request.ProductCreateRequest;
import com.nishant.model.response.ApiResponse;
import com.nishant.service.CategoryService;
import com.nishant.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
@RequestMapping(value = "/products", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProductController {

    private ProductService productService;

    private CategoryService categoryService;

    private ProductMapper productMapper;

    @GetMapping("/{id}")
    public @ResponseBody ApiResponse<Product> read(@PathVariable("id") final Long id){
        return new ApiResponse<>(productService.read(id));
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ApiResponse<Product> create(@RequestBody final ApiRequest<ProductCreateRequest> request){
        final Category category = categoryService.read(request.getPayload().getCategoryId());
        final Product product = productMapper.MapToEntity(request.getPayload());
        product.setCategory(category);
        return new ApiResponse<>(productService.create(product));
    }

    @PutMapping
    public @ResponseBody ApiResponse<Product> update(@RequestBody final Product product){
        return new ApiResponse<>(productService.update(product));
    }

    @PatchMapping("/{id}")
    public @ResponseBody ApiResponse<Product> update(@PathVariable("id") final Long id, @RequestBody final Product product){
        return new ApiResponse<>(productService.update(id,product));
    }

    @DeleteMapping("/{id}")
    public @ResponseBody ApiResponse<Boolean> delete(@PathVariable("id") final Long id){
        return new ApiResponse<>(productService.delete(id));
    }
}
