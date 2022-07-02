package com.hello.exemple01.Controller;

import com.hello.exemple01.Entitys.User;
import com.hello.exemple01.Entitys.UserDto;
import com.hello.exemple01.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService service;

    ArrayList<User> users = new ArrayList<>();

    @GetMapping
    public ArrayList<User> getUsers() {
        return users;
    }

    @PostMapping
    public ArrayList<User> insertUser(@RequestBody UserDto userObj) {
        long number = (long)(Math.random() * 99 + 1);
        User user = new User(number, userObj.getEmail(), userObj.getName(), userObj.getPassword());
        users.add(user);
        return users;
    }

    @PostMapping("/add")
    public Boolean addUser(@RequestBody UserDto newUser) {
        long number = (long)(Math.random() * 99 + 1);
        User user = new User(number, newUser.getEmail(), newUser.getName(), newUser.getPassword());
        return service.insert(user);
    }

    @DeleteMapping(value="/{id}")
    public ArrayList<User> deleteById(@PathVariable long id) {
        users.removeIf(user -> user.getId() == id);
        return users;
    }

    @DeleteMapping
    public ArrayList<User> deleteAll() {
        users.clear();
        return users;
    }

}
