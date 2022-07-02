package com.exercicio02.app.services;

import com.exercicio02.app.dto.RequestCategoryDto;
import com.exercicio02.app.entitys.Category;
import com.exercicio02.app.repositorys.CategoryRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() { return repository.findAll(); }

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);

        return obj.get();
    }

    public Optional<List<Category>> findByName(String name) {
        return repository.findByName(name);
    }

    public Category findByIdAndProduct(Long id) { return repository.findCategoryByIdFetchProducts(id); }

    public Integer countProductInCategory(Long id) {
        Category category = repository.findCategoryByIdFetchProducts(id);
        return category.getProducts().size();
    }

    public Category insert(RequestCategoryDto request) {
        Category category = new Category(null, request.getName(), request.getDescription());
        return repository.save(category);
    }

    public Category update(Long id, RequestCategoryDto request) {
        Category category = repository.findByIdCast(id);
        category.setName(request.getName());
        category.setDescription(request.getDescription());
        return repository.save(category);
    }

    public void delete (Long id) {
        Category category = repository.findByIdCast(id);
        repository.delete(category);
    }
}
