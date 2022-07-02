package com.exercicio02.app.services;

import com.exercicio02.app.entitys.Product;
import com.exercicio02.app.repositorys.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = repository.findById(id);

        return obj.get();
    }

    public Product insert(Product product) {
        return repository.save(product);
    }

    public Product update(Product product) {
        return repository.save(product);
    }

    public void delete (Product product) {
        repository.delete(product);
    }

    public Optional<List<Product>> findByName(String name) { return repository.findByName(name); }

    public Optional<List<Product>> findByQuantityGreaterThan(int quantity ) { return repository.findByQuantityGreaterThan(quantity); }

    public Optional<List<Product>> findAllAscByName() {
        return repository.findByOrderByNameAsc();
    }

    public Optional<List<Product>> findTop10ByOrderByQuantityDesc() { return repository.findTop10ByOrderByQuantityDesc(); }

}
