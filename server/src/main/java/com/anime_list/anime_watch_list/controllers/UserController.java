package com.anime_list.anime_watch_list.controllers;

import com.anime_list.anime_watch_list.models.Anime;
import com.anime_list.anime_watch_list.models.User;
import com.anime_list.anime_watch_list.repositroies.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserRepository userRepository;



//    INDEX
    @GetMapping // localhost:8080/users
        public ResponseEntity <List<User>> getUser(){
        return new ResponseEntity(userRepository.findAll(), HttpStatus.OK);
    }

//    SHOW
    @GetMapping("/{id}") // localhost:8080/user/X
    public ResponseEntity<User> getUser(@PathVariable Long id){
        var found = userRepository.findById(id);
        return new ResponseEntity(userRepository.findById(id), found.isEmpty() ? HttpStatus.NOT_FOUND : HttpStatus.OK);
    }

//    POST
    @PostMapping
    public ResponseEntity<List<User>> createUser(@RequestBody User newUser){
        userRepository.save(newUser);
        return new ResponseEntity(userRepository.findAll(), HttpStatus.CREATED);
    }

//    DELETE


//    PUT



}
