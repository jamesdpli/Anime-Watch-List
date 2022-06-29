package com.anime_list.anime_watch_list.repositroies;

import com.anime_list.anime_watch_list.models.Anime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface AnimeRepository extends JpaRepository<Anime, Long> {

//    NEW
    List<Anime> findAnimeByName(String name);

    List<Anime> findAnimeByReleaseDateGreaterThan(LocalDate releaseDate);

    List<Anime> findAnimeByRatingGreaterThan(double rating);

    List<Anime> findAnimeByNumberOfEpsGreaterThan(int numberOfEps);
}
