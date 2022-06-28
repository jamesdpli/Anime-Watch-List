package com.anime_list.anime_watch_list.controllers;

import com.anime_list.anime_watch_list.models.Anime;
import com.anime_list.anime_watch_list.models.Genre;
import com.anime_list.anime_watch_list.repositroies.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("genres")
public class GenreController {

    @Autowired
    GenreRepository genreRepository;

    // GET
    @GetMapping
    public ResponseEntity<List<Genre>> getGenres(){
        return new ResponseEntity<>(genreRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}") //localhost:8080/genres/1
    public ResponseEntity<Optional<Genre>> getGenre(@PathVariable Long id) {
        Optional<Genre> genre = genreRepository.findById(id);
        return new ResponseEntity<>(genre, genre.isEmpty() ? HttpStatus.NOT_FOUND : HttpStatus.OK);
    }

}
