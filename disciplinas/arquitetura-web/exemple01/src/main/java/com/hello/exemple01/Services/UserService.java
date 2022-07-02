package com.hello.exemple01.Services;

import com.hello.exemple01.Entitys.User;
import com.hello.exemple01.Repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public boolean insert(User user) {
        return repository.insert(user);
    }

}
