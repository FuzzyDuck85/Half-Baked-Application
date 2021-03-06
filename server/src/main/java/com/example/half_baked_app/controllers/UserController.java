package com.example.half_baked_app.controllers;

import com.example.half_baked_app.models.User;
import com.example.half_baked_app.repository.UserRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/users")
    public ResponseEntity<List<User>> getAllUsers() {
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/users/{id}")
    public ResponseEntity getUser(@PathVariable Long id) {
        return new ResponseEntity<>(userRepository.findById(id), HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping(value = "/users")
    public ResponseEntity<User> postUser(@RequestBody User user) {
        userRepository.save(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @CrossOrigin
    @DeleteMapping(value = "/users/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable Long id) {
        User found = userRepository.getOne(id);
        userRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @CrossOrigin
    @PutMapping(value = "/users/{id}")
    public ResponseEntity<User> updatedUser(@PathVariable Long id, @RequestBody User user) {
            User updatedUser = userRepository.getOne(id);
            updatedUser.setWeight(user.getWeight());
            updatedUser.setGender(user.getGender());
            updatedUser.setAge(user.getAge());
            userRepository.save(updatedUser);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }


}