package com.anime_list.anime_watch_list.controllers;

import com.anime_list.anime_watch_list.models.Anime;
import com.anime_list.anime_watch_list.models.User;
import com.anime_list.anime_watch_list.models.WatchList;
import com.anime_list.anime_watch_list.repositroies.AnimeRepository;
import com.anime_list.anime_watch_list.repositroies.GenreRepository;
import com.anime_list.anime_watch_list.repositroies.UserRepository;
import com.anime_list.anime_watch_list.repositroies.WatchListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("animes")
public class AnimeController{

    @Autowired
    AnimeRepository animeRepository;

    @Autowired
    GenreRepository genreRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    WatchListRepository watchListRepository;

    //GET MAPPING
    @GetMapping //localhost:8080/animes
    public ResponseEntity<List<Anime>> getAnime(){
        return new ResponseEntity(animeRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}") //localhost:8080/animes/1
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

    //PUT
    @PutMapping(value = "/{id}") //localhost:8080/animes/1
    public ResponseEntity<Anime> updateAnime(@PathVariable(value = "id") Long id, @RequestBody Anime upAnime) throws Exception{
        Optional<Anime> anime = animeRepository.findById(id);
        if(anime.isEmpty()){
            throw new Exception("Anime with id: " + id + " not found");
        } else {
            Anime a = anime.get();
            a.setName(upAnime.getName());
            a.setReleaseDate(upAnime.getReleaseDate());
            a.setDescription(upAnime.getDescription());
            a.setRating(upAnime.getRating());
            a.setNumberOfEps(upAnime.getNumberOfEps());

            Anime updatedAnime = animeRepository.save(a);
            return new ResponseEntity<>(updatedAnime,HttpStatus.OK);
        }
    }

    // DELETE MAPPING
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Anime>> deleteAnime(@PathVariable Long id) {
        var found = animeRepository.findById(id);
        animeRepository.deleteById(id);
        return new ResponseEntity(animeRepository.findAll(), found.isEmpty() ? HttpStatus.NOT_FOUND : HttpStatus.OK);
    }

//    DELETE
//    @DeleteMapping(value = "/{id}")
//    public ResponseEntity<Long> removeAnimeById(@PathVariable("id") Long id) {
//        Optional<Anime> anime = animeRepository.findById(id);
//        if (anime.isPresent()) {
//            Anime upAnime = anime.get();
//            upAnime.getGenres().stream()
//                    .forEach(genre -> genreRepository.deleteById(genre.getId()));
//            upAnime.setGenres(new ArrayList<>());
//            animeRepository.deleteById(id);
//        }
//        return new ResponseEntity<>(id, HttpStatus.OK);
//    }
}