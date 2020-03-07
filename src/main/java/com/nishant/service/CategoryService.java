package com.nishant.service;

import com.nishant.entity.Category;
import com.nishant.entity.Product;
import com.nishant.repository.CategoryBaseRepository;

@org.springframework.stereotype.Service
public class CategoryService extends Service<Category, Long> {

    private CategoryBaseRepository categoryBaseRepository;

    public CategoryService(CategoryBaseRepository categoryBaseRepository) {
        super(categoryBaseRepository);
        this.categoryBaseRepository = categoryBaseRepository;
    }

    public Category create(final Category category){
        category.setDeleted(false);
        return categoryBaseRepository.save(category);
    }

    public Category update(final Long id, final Category category){
        final Category fromDb = read(id);
        fromDb.merge(category);
        return update(category);
    }

}
