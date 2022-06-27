package com.anime_list.anime_watch_list;

import com.anime_list.anime_watch_list.repositroies.AnimeRepository;
import com.anime_list.anime_watch_list.repositroies.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AnimeWatchListApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	AnimeRepository animeRepository;


	@Test
	void contextLoads() {
	}

}
