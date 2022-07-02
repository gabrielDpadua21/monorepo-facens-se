package com.exercicio01.jdbc.app.config;

import com.exercicio01.jdbc.app.entitys.User;
import com.exercicio01.jdbc.app.repository.UserRepository;
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
        User user5 = new User(null, "Gabriel 3", "gabriel3@gmail.com", "123456");

        userRepository.saveAll(Arrays.asList(user1, user2, user3, user4, user5));

        User user3Update = userRepository.findByEmail(user3.getEmail());
        user3Update.setName("Frajola");
        user3Update.setEmail("frajola@gmail.com");
        userRepository.save(user3Update);

        User user4Delete = userRepository.findByEmail(user4.getEmail());
        userRepository.delete(user4Delete);

        User user5Delete = userRepository.findByEmail(user5.getEmail());
        userRepository.deleteById(user5Delete.getId());
    }

}
