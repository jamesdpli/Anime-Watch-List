package com.anime_list.anime_watch_list.controllers;

import com.anime_list.anime_watch_list.models.Genre;
import com.anime_list.anime_watch_list.repositroies.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("genres")
public class GenreController {

    @Autowired
    GenreRepository genreRepository;

    @GetMapping
    public ResponseEntity<List<Genre>> getGenres(){
        return new ResponseEntity<>(genreRepository.findAll(), HttpStatus.OK);
    }

}
