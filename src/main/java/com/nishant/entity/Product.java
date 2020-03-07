package com.nishant.entity;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.StringUtils;

import javax.persistence.*;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product extends Base {

    private String name;

    private Long count;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id")
    @JsonIgnoreProperties("product")
    private Category category;

    public void merge(final Product product){
        if (!StringUtils.isEmpty(product.name))
            this.name = product.getName();
        if (product.count != null)
            this.count = product.getCount();
        if (product.getCategory() != null)
            this.category = product.getCategory();
    }
}
