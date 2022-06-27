package com.anime_list.anime_watch_list.repositroies;

import com.anime_list.anime_watch_list.models.Anime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimeRepository extends JpaRepository<Anime, Long> {

}
