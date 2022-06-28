package com.anime_list.anime_watch_list.repositroies;

import com.anime_list.anime_watch_list.models.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}
