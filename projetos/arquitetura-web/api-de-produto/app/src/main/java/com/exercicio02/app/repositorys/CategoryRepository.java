package com.exercicio02.app.repositorys;

import com.exercicio02.app.entitys.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByIdCast(Long id);

    Optional<Category> findAllByOrderByNameAsc();

    Optional<List<Category>> findByName(String name);

    @Query("select c from Category c left join fetch c.products where c.id = :id")
    Category findCategoryByIdFetchProducts(@Param("id") Long id);
}
