package com.example02.app.resources;

import com.example02.app.dto.AuthRequestDto;
import com.example02.app.dto.UserRequestDto;
import com.example02.app.dto.UserResponseDto;
import com.example02.app.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "user")
public class UserResource {

    @Autowired
    UserService service;

    @PostMapping
    public UserResponseDto insert(@RequestBody UserRequestDto req) {
        return service.insert(req);
    }

    @GetMapping(value = "/{id}")
    public UserResponseDto getById(@PathVariable long id) throws Exception {
        return service.getById(id);
    }

    @GetMapping
    public List<UserResponseDto> getAll() {
        return service.getAll();
    }

    @DeleteMapping(value = "/{id}")
    public boolean delete(@PathVariable long id) {
        return service.delete(id);
    }

    @PutMapping(value = "/{id}")
    public UserResponseDto update(@PathVariable long id, @RequestBody UserRequestDto req) {
        return service.update(id, req);
    }

    @PostMapping
    public UserResponseDto auth(@RequestBody AuthRequestDto req) {
        return service.auth(req);
    }

}
