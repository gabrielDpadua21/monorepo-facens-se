package com.exercicio02.app.resources;


import com.exercicio02.app.dto.RequestCategoryDto;
import com.exercicio02.app.entitys.Category;
import com.exercicio02.app.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/category")
public class CategoryResource {

    @Autowired
    private CategoryService service;

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id) {
        Category category = service.findById(id);
        return ResponseEntity.ok().body(category);
    }

    @GetMapping(value = "/{id}/product")
    public ResponseEntity<Category> findByIdAndProduct(@PathVariable Long id) {
        Category category = service.findByIdAndProduct(id);
        return ResponseEntity.ok().body(category);
    }

    @GetMapping(value = "/{id}/product/count")
    public ResponseEntity<Object> countProductInCategory(@PathVariable Long id) {
        Integer count = service.countProductInCategory(id);
        return ResponseEntity.ok().body(count);
    }

    @GetMapping(value = "/name/{name}")
    public ResponseEntity<Optional<List<Category>>> findByName(@PathVariable String name) {
        Optional<List<Category>> categories = service.findByName(name);
        return ResponseEntity.ok().body(categories);
    }

    @PostMapping()
    public ResponseEntity<Category> insert(@RequestBody RequestCategoryDto request) {
        Category category = service.insert(request);
        return ResponseEntity.ok().body(category);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Category> update(@PathVariable Long id, @RequestBody RequestCategoryDto request) {
        Category category = service.update(id, request);
        return ResponseEntity.ok().body(category);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.ok().body(true);
    }

}
