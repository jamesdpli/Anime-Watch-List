package com.anime_list.anime_watch_list.repositroies;

import com.anime_list.anime_watch_list.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {



}
