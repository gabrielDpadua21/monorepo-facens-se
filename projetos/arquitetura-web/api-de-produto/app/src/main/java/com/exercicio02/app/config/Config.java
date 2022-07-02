package com.exercicio02.app.config;

import com.exercicio02.app.entitys.Category;
import com.exercicio02.app.entitys.Product;
import com.exercicio02.app.repositorys.CategoryRepository;
import com.exercicio02.app.repositorys.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Config implements CommandLineRunner {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String ...args) throws Exception {
        Category c1 = new Category(null, "Ação", "ação");
        Category c2 = new Category(null, "Aventura", "Aventura");
        Category c3 = new Category(null, "Terror", "Terror");
        Category c4 = new Category(null, "RPG", "RPG");

        categoryRepository.saveAll(Arrays.asList(c1, c2, c3, c4));

        Product p1 = new Product(null, "The witcher III - Wind hunt", 2);
        Product p2 = new Product(null, "Tomb Raider", 3);
        Product p3 = new Product(null, "Rise of the Tomb Raider", 5);
        Product p4 = new Product(null, "Shadow of the Tomb Raider", 2);
        Product p5 = new Product(null, "teste", 2);

        p1.setCategory(c1);
        p2.setCategory(c2);
        p3.setCategory(c3);
        p4.setCategory(c4);
        p5.setCategory(c4);

        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
    }

}
