package com.nishant.repository;

import com.nishant.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryBaseRepository extends JpaRepository<Category,Long> {
    public Category findByName(final String name);
}
