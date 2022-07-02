package com.exercicio02.app.resources;

import com.exercicio02.app.entitys.Product;
import com.exercicio02.app.services.CategoryService;
import com.exercicio02.app.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductResource {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ProductService service;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Product product = service.findById(id);
        return ResponseEntity.ok().body(product);
    }

    @GetMapping(value = "/name/{name}")
    public ResponseEntity<Optional<List<Product>>> findByName(@PathVariable String name) {
        Optional<List<Product>> products = service.findByName(name);
        return ResponseEntity.ok().body(products);
    }

    @GetMapping(value = "/name/asc")
    public ResponseEntity<Optional<List<Product>>> findAllAscName() {
        Optional<List<Product>> products = service.findAllAscByName();
        return ResponseEntity.ok().body(products);
    }

    @GetMapping(value = "/quantity/{quantity}")
    public ResponseEntity<Optional<List<Product>>> findByQuantityGreaterThan(@PathVariable int quantity) {
        Optional<List<Product>> products = service.findByQuantityGreaterThan(quantity);
        return ResponseEntity.ok().body(products);
    }

    @GetMapping(value = "/quantity/big")
    public ResponseEntity<Optional<List<Product>>> findByQuantityGreaterThan() {
        Optional<List<Product>> products = service.findTop10ByOrderByQuantityDesc();
        return ResponseEntity.ok().body(products);
    }
}
