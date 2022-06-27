package com.anime_list.anime_watch_list.components;

import com.anime_list.anime_watch_list.models.Anime;
import com.anime_list.anime_watch_list.models.Genre;
import com.anime_list.anime_watch_list.models.User;
import com.anime_list.anime_watch_list.repositroies.AnimeRepository;
import com.anime_list.anime_watch_list.repositroies.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    AnimeRepository animeRepository;



    @Override
    public void run (ApplicationArguments args) throws Exception {

//        TODO: ADD ANIMES
//        name, relaseDate,description, genre, rating, numberOfEps
        Anime anime1 = new Anime("Naruto", LocalDate.of(2002, 10, 03), "Ninja's", Genre.ACTION, 4.5, 500);
        Anime anime2 = new Anime("Bleach", LocalDate.of(2004, 10, 05), "Soul reaper's", Genre.ACTION, 4.5, 366);
        Anime anime3 = new Anime("Attack on Titan", LocalDate.of(2002, 10, 03), "Ninja anime", Genre.ACTION, 4.5, 500);
        Anime anime4 = new Anime("One Piece", LocalDate.of(2002, 10, 03), "Ninja anime", Genre.ACTION, 4.5, 500);
        Anime anime5 = new Anime("Haikyuu", LocalDate.of(2002, 10, 03), "Ninja anime", Genre.ACTION, 4.5, 500);
        Anime anime6 = new Anime("Kuroko's Basketball", LocalDate.of(2002, 10, 03), "Ninja anime", Genre.ACTION, 4.5, 500);
        Anime anime7 = new Anime("Bungo Stray Dogs", LocalDate.of(2002, 10, 03), "Ninja anime", Genre.ACTION, 4.5, 500);
        Anime anime8 = new Anime("Death Note", LocalDate.of(2002, 10, 03), "Ninja anime", Genre.ACTION, 4.5, 500);
        Anime anime9 = new Anime("Slam Dunk", LocalDate.of(2002, 10, 03), "Ninja anime", Genre.ACTION, 4.5, 500);
        Anime anime10 = new Anime("Jojo's Bizzare Adventure", LocalDate.of(2002, 10, 03), "Ninja anime", Genre.ACTION, 4.5, 500);
        animeRepository.saveAll(Arrays.asList(anime1, anime2, anime3, anime4, anime5, anime6, anime7, anime8, anime9, anime10));



//        TODO: ADD USERS
        User user1 = new User("Onoda", LocalDate.of(1999,9,2), "onodaKun@gmail.com", List.of(anime1));
        User user2 = new User("John", LocalDate.of(1959,6,25), "jhonny@gmail.com", List.of(anime1,anime3,anime4));
        User user3 = new User("Rem", LocalDate.of(2001,9,4), "Kem@gmail.com", List.of(anime6,anime4));
        User user4 = new User("Jenny", LocalDate.of(1969,3,27), "janjenny@gmail.com", List.of(anime1,anime10,anime5));
        User user5 = new User("Shiki", LocalDate.of(1999,9,2), "Shiki43@gmail.com", List.of(anime1,anime4,anime5));
        User user6 = new User("Randy", LocalDate.of(1599,4,15), "Randy432@gmail.com", List.of(anime1,anime4));
        User user7 = new User("Shuka", LocalDate.of(1999,9,2), "onodaKun@gmail.com", List.of(anime1));
        User user8 = new User("Obu", LocalDate.of(1999,9,2), "ObiObi@gmail.com", List.of(anime1,anime7,anime5));
        User user9 = new User("Onoda", LocalDate.of(1999,9,2), "onodaKun@gmail.com", List.of(anime1));
        User user10 = new User("Onoda", LocalDate.of(1999,9,2), "onodaKun@gmail.com", List.of(anime1));
        User user11 = new User("Onoda", LocalDate.of(1999,9,2), "onodaKun@gmail.com", List.of(anime1));
        User user12 = new User("Onoda", LocalDate.of(1999,9,2), "onodaKun@gmail.com", List.of(anime1));














    }
}
