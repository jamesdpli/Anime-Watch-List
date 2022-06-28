package com.anime_list.anime_watch_list.controllers;

import com.anime_list.anime_watch_list.models.Anime;
import com.anime_list.anime_watch_list.models.User;
import com.anime_list.anime_watch_list.repositroies.AnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("animes")
public class AnimeController{

    @Autowired
    AnimeRepository animeRepository;


    //GET MAPPING

    //localhost:8080/animes
    @GetMapping
    public ResponseEntity<List<Anime>> getAnime(){
        return new ResponseEntity(animeRepository.findAll(), HttpStatus.OK);
    }

    //localhost:8080/animes/1
    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Anime>> getAnime(@PathVariable Long id) {
        Optional<Anime> anime = animeRepository.findById(id);
        return new ResponseEntity<>(anime, anime.isEmpty() ? HttpStatus.NOT_FOUND : HttpStatus.OK);
    }

    // POST MAPPING
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Anime>> createAnime(@RequestBody Anime newAnime){
        animeRepository.save(newAnime);
        return new ResponseEntity(animeRepository.findAll(), HttpStatus.CREATED);
    }

    // DELETE MAPPING
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Anime>> deleteAnime(@PathVariable Long id) {
        var found = animeRepository.findById(id);
        animeRepository.deleteById(id);
        return new ResponseEntity(animeRepository.findAll(), found.isEmpty() ? HttpStatus.NOT_FOUND : HttpStatus.OK);
    }



}