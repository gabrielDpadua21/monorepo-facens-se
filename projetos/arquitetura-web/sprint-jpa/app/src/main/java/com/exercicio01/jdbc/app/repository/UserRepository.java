package com.exercicio01.jdbc.app.repository;


import com.exercicio01.jdbc.app.entitys.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}
