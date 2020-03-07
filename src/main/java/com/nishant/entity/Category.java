package com.nishant.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.StringUtils;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Category  extends Base{

    private String name;

    private String description;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "category")
    @JsonIgnoreProperties("category")
    private List<Product> products;

    public void merge(final Category category){
        if (!StringUtils.isEmpty(category.getName()))
            this.name = category.getName();
        if (!StringUtils.isEmpty(category.getDescription()))
            this.description = category.getDescription();
    }
}
