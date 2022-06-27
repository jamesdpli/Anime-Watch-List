package com.anime_list.anime_watch_list.repositroies;

import com.anime_list.anime_watch_list.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
