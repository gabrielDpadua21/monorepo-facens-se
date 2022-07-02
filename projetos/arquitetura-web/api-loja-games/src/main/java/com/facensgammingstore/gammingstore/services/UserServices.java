package com.facensgammingstore.gammingstore.services;

import com.facensgammingstore.gammingstore.entities.User;
import com.facensgammingstore.gammingstore.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServices {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);

        return obj.get();
    }

    public User findByEmail(String email) {
        Optional<User> obj = repository.findByEmail(email);

        return obj.get();
    }

    public User insert(User obj) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        obj.setPassword(passwordEncoder.encode(obj.getPassword()));
        User newUser = repository.save(obj);

        newUser.setPassword("");

        return newUser;
    }

}
