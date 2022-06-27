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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DataLoader implements ApplicationRunner {


    @Autowired
    AnimeRepository animeRepository;

    @Autowired
    UserRepository userRepository;



    @Override
    public void run (ApplicationArguments args) throws Exception {

//      Add Anime
        Anime anime1 = new Anime("Naruto", LocalDate.of(2002, 10, 03), "Ninja's", Genre.ACTION, 4.6, 500);
        Anime anime2 = new Anime("Bleach", LocalDate.of(2004, 10, 05), "Soul reaper's", Genre.ACTION, 4.5, 366);
        Anime anime3 = new Anime("Attack on Titan", LocalDate.of(2013, 04, 07), "Titans destroy humanity", Genre.ACTION, 4.5, 86);
        Anime anime4 = new Anime("One Piece", LocalDate.of(1999, 10, 03), "Pirates", Genre.ACTION, 4.5, 1014);
        Anime anime5 = new Anime("Haikyuu", LocalDate.of(2014, 04, 06), "High school volley ball", Genre.SPORTS, 4.5, 73);
        Anime anime6 = new Anime("Kuroko's Basketball", LocalDate.of(2012, 04, 07), "High school basket ball team", Genre.SPORTS, 4.5, 75);
        Anime anime7 = new Anime("Bungo Stray Dogs", LocalDate.of(2016, 04, 07), "Detectives ", Genre.ACTION, 4.5, 500);
        Anime anime8 = new Anime("Death Note", LocalDate.of(2002, 10, 03), "Ninja anime", Genre.ACTION, 4.5, 500);
        Anime anime9 = new Anime("Slam Dunk", LocalDate.of(2002, 10, 03), "Ninja anime", Genre.ACTION, 4.5, 500);
        Anime anime10 = new Anime("Jojo's Bizzare Adventure", LocalDate.of(2002, 10, 03), "Ninja anime", Genre.ACTION, 4.5, 500);

//      Add User
        User user1 = new User("Onoda", LocalDate.of(1999,9,2), "onodaKun@gmail.com", Arrays.asList(anime1));
        User user2 = new User("John", LocalDate.of(1959,6,25),"lol@gmail.com", Arrays.asList(anime4, anime5, anime9));
        User user3 = new User("Rem", LocalDate.of(2001,9,4), "Kem@gmail.com", Arrays.asList(anime2));
        User user4 = new User("Jenny", LocalDate.of(1969,3,27), "janjenny@gmail.com", Arrays.asList(anime2, anime3));
        User user5 = new User("Shiki", LocalDate.of(1999,9,14), "Shiki43@gmail.com", Arrays.asList(anime10));
        User user6 = new User("Randy", LocalDate.of(1599,5,15), "Randy432@gmail.com", Arrays.asList(anime4));
        User user7 = new User("Shuka", LocalDate.of(1999,9,2), "onodaKun@gmail.com", Arrays.asList(anime2));
        User user8 = new User("Obu", LocalDate.of(2003,9,3), "ObiObi@gmail.com", Arrays.asList(anime3));
        User user9 = new User("Kite", LocalDate.of(1998,6,6), "Kie7673@gmail.com", Arrays.asList(anime7, anime5));
        User user10 = new User("Pete", LocalDate.of(1987,9,23), "PITY@gmail.com", Arrays.asList(anime2));
        User user11 = new User("Kwnichi", LocalDate.of(1989,6,24), "koitd@gmail.com", Arrays.asList(anime2));
        User user12 = new User("Quinnie", LocalDate.of(2001,9,2), "qunie432@gmail.com", Arrays.asList(anime2));

        animeRepository.saveAll(Arrays.asList(anime1, anime2, anime3, anime4, anime5, anime6, anime7, anime8, anime9, anime10));
        userRepository.saveAll(Arrays.asList(user1, user2, user3, user4, user5, user6, user7, user8, user9, user10, user11, user12));
    }
}
