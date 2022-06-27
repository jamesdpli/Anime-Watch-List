package com.anime_list.anime_watch_list.controllers;

import com.anime_list.anime_watch_list.models.Anime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public class AnimeController{
    @Autowired
    Anime anime;


}