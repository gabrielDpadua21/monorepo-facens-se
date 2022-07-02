package com.exercicio02.app.repositorys;

import com.exercicio02.app.entitys.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Optional<List<Product>> findByName(String name);

    Optional<List<Product>> findByQuantityGreaterThan(int quantity);

    Optional<List<Product>> findTop10ByOrderByQuantityDesc();

    Optional<List<Product>> findByOrderByNameAsc();

}
