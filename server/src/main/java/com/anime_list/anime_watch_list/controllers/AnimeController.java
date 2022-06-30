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

    @GetMapping(value = "/{id}") //localhost:8080/animes/X
    public ResponseEntity<Optional<Anime>> getAnime(@PathVariable Long id) {
        Optional<Anime> anime = animeRepository.findById(id);
        return new ResponseEntity<>(anime, anime.isEmpty() ? HttpStatus.NOT_FOUND : HttpStatus.OK);
    }

    // Post
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE) //localhost:8080/animes
    public ResponseEntity<List<Anime>> createAnime(@RequestBody Anime newAnime){
        animeRepository.save(newAnime);
        return new ResponseEntity(animeRepository.findAll(), HttpStatus.CREATED);
    }

    // Put
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

    // Delete
    // If we want to delete an anime we must remove all watch lists containing that anime FIRST,
    // as a watch list cannot have a null anime
    @DeleteMapping(value = "animeInWatchList/{id}")
    public ResponseEntity<String> removeAnimeInWatchListById(@PathVariable("id") Long id) {
        List<WatchList> AllWatchLists = watchListRepository.findAll();
        Optional<Anime> anime = animeRepository.findById(id);


        for(int i = 0; i < AllWatchLists.size(); i++) {
            if(AllWatchLists.get(i).getAnime().getName().equals(anime.get().getName())) {
                watchListRepository.deleteById(AllWatchLists.get(i).getId());
                animeRepository.deleteById(id);
            }
        }

        return new ResponseEntity("Anime Deleted id: " + id   , HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> removeAnimeNotInWatchListById(@PathVariable Long id) {
        var found = animeRepository.findById(id);
        animeRepository.deleteById(id);
        return new ResponseEntity("Anime Deleted id: " + id, HttpStatus.NOT_FOUND);
    }

}