package com.anime_list.anime_watch_list.controllers;

import com.anime_list.anime_watch_list.models.User;
import com.anime_list.anime_watch_list.repositroies.WatchListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("watchLists")
public class WatchListController {

    @Autowired
    private WatchListRepository watchListRepository;



    //    INDEX
    @GetMapping // localhost:8080/users
    public ResponseEntity<List<User>> getWatchLists(){
        return new ResponseEntity(watchListRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}") // localhost:8080/user/X
    public ResponseEntity<User> getWatchList(@PathVariable Long id){
        var found = watchListRepository.findById(id);
        return new ResponseEntity(watchListRepository.findById(id), found.isEmpty() ? HttpStatus.NOT_FOUND : HttpStatus.OK);
    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity<String> deleteWathList(@PathVariable Long id) {
        var found = watchListRepository.findById(id);
        watchListRepository.deleteById(id);
        return new ResponseEntity("WatchList Deleted" + id, HttpStatus.NOT_FOUND);
    }



}
