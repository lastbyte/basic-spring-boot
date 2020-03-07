package com.nishant.repository;

import com.nishant.entity.Category;
import com.nishant.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductBaseRepository extends JpaRepository<Product,Long> {
    public Product findByName(final String name);

    public Product findByCategoryName(final String categoryName);
}
