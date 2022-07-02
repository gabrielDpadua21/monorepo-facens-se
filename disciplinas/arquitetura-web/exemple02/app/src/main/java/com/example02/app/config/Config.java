package com.example02.app.config;

import com.example02.app.entitys.User;
import com.example02.app.repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Config implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User user1 = new User(null, "Dean Winchester", "ddog@gmail.com", "LuciferBacana");
        User user2 = new User(null, "Sam Winchester", "sammy@gmail.com", "LuciferBacana");
        User user3 = new User(null, "Gabriel", "gabriel@gmail.com", "123456");
        User user4 = new User(null, "Gabriel 2", "gabriel2@gmail.com", "123456");

        userRepository.saveAll(Arrays.asList(user1, user2, user3, user4));
    }

}
