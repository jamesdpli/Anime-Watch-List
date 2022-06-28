package com.anime_list.anime_watch_list.repositroies;

import com.anime_list.anime_watch_list.models.Anime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnimeRepository extends JpaRepository<Anime, Long> {

//    To express the inequality
//    List<Anime> findByNameNot(String name);
//
//    List<Anime> findByNumberOfEpisodes(int numberOfEps);

}
