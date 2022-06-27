package com.anime_list.anime_watch_list.components;

import com.anime_list.anime_watch_list.repositroies.AnimeRepository;
import com.anime_list.anime_watch_list.repositroies.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    AnimeRepository animeRepository;




    public void run (ApplicationArguments args) throws Exception {

//        TODO: ADD ANIMES




//        TODO: ADD USERS













    }
}
