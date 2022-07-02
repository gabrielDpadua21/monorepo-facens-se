package com.exercicio01.jdbc.app.services;

import com.exercicio01.jdbc.app.dto.AuthRequestDto;
import com.exercicio01.jdbc.app.dto.UserRequestDto;
import com.exercicio01.jdbc.app.dto.UserResponseDto;
import com.exercicio01.jdbc.app.entitys.User;
import com.exercicio01.jdbc.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public UserResponseDto insert(UserRequestDto req) {
        User newUser = new User(null, req.getName(), req.getEmail(), req.getPassword());
        newUser = repository.save(newUser);
        return new UserResponseDto(newUser.getId(), newUser.getName(), newUser.getEmail());
    }

    public UserResponseDto getById(Long usrId) throws Exception {
        User user = repository.getById(usrId);
        if(user == null) {
            throw new Exception();
        }
        return new UserResponseDto(user.getId(), user.getName(), user.getEmail());
    }

    public List<UserResponseDto> getAll() {
        List<User> users = repository.findAll();
        List<UserResponseDto> response = new ArrayList<UserResponseDto>();
        for(User user: users) {
            response.add(new UserResponseDto(user.getId(), user.getName(), user.getEmail()));
        }
        return response;
    }

    public boolean delete(Long id) {
        repository.deleteById(id);
        return true;
    }

    public UserResponseDto update(long id, UserRequestDto req) {
        User user = repository.getById(id);
        user.setEmail(req.getEmail());
        user.setName(req.getName());
        user.setPassword(req.getPassword());
        repository.save(user);
        return new UserResponseDto(user.getId(), user.getName(), user.getName());
    }

    public UserResponseDto auth(AuthRequestDto req) {
        User user = repository.findByEmail(req.getEmail());
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        boolean isPassword = passwordEncoder.matches(req.getPassword(), user.getPassword());
        if (isPassword) {
            return new UserResponseDto(user.getId(), user.getName(), user.getEmail());
        }
        return new UserResponseDto();
    }
}
