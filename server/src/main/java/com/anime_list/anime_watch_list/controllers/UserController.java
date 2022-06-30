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

    //GET
    @GetMapping // localhost:8080/users
        public ResponseEntity <List<User>> getUser(){
        return new ResponseEntity(userRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}") // localhost:8080/user/X
    public ResponseEntity<User> getUser(@PathVariable Long id){
        var found = userRepository.findById(id);
        return new ResponseEntity(userRepository.findById(id), found.isEmpty() ? HttpStatus.NOT_FOUND : HttpStatus.OK);
    }

//    SHOW

    @GetMapping(value = "/name={name}")
    public ResponseEntity<List<User>> getUsersByName(@PathVariable String name) {
        List<User> userByName = userRepository.findUsersByName(name);
        return new ResponseEntity<>(userByName, HttpStatus.OK);
    }



    //POST
    @PostMapping
    public ResponseEntity<List<User>> createUser(@RequestBody User newUser){
        userRepository.save(newUser);
        return new ResponseEntity(userRepository.findAll(), HttpStatus.CREATED);
    }

    //PUT
    @PutMapping(value = "/{id}") //localhost:8080/users/1
    public ResponseEntity<User> updateUser(@PathVariable(value = "id") Long id, @RequestBody User upUser) throws Exception{
        Optional<User> user = userRepository.findById(id);
        if(user.isEmpty()){
            throw new Exception("User with id: " + id + " not found");
        } else {
            User u = user.get();
            u.setName(upUser.getName());
            u.setDob(upUser.getDob());
            u.setEmail(upUser.getEmail());

            User updatedUser = userRepository.save(u);
            return new ResponseEntity<>(updatedUser,HttpStatus.OK);
        }
    }

    //DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<List<User>> deleteUser(@PathVariable Long id) {
        var found = userRepository.findById(id);
        userRepository.deleteById(id);
        return new ResponseEntity(userRepository.findAll(), found.isEmpty() ? HttpStatus.NOT_FOUND : HttpStatus.OK);
    }
}
