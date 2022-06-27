package com.anime_list.anime_watch_list.controllers;

import com.anime_list.anime_watch_list.repositroies.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

//    INDEX
//    @GetMapping
//        public ResponseEntity <List<Anime>> (){
//        return new ResponseEntity(userRepository.findAll(), HttpStatus.OK);
//    }

//    SHOW

//    PUT

//    POST

//    DELETE



}
