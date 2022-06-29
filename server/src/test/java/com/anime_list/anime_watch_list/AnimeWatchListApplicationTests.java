package com.anime_list.anime_watch_list;

import com.anime_list.anime_watch_list.models.Anime;
import com.anime_list.anime_watch_list.models.User;
import com.anime_list.anime_watch_list.repositroies.AnimeRepository;
import com.anime_list.anime_watch_list.repositroies.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class AnimeWatchListApplicationTests {

	@Autowired
	AnimeRepository animeRepository;

	@Autowired
	UserRepository userRepository;



	@Test
	void contextLoads() {
	}

//	------------ User DQ Tests ------------

//	@Test
//	public void canFindNameStartingWith(){
//		List<User> found = userRepository.findByNameStartingWith("O");
//		assertThat(found.size()).isEqualTo(2);
//	}

//	Tests failing b/c : failed to load application context

//	@Test
//	public void canFindNameByLetter(){
//		Integer found = userRepository.countByNameContaining("a");
//		assertThat(found).isEqualTo(2);
//	}

//	USER TESTS:

	@Test
	public void canFindUserByDobAfter(){
		List<User> foundUser = userRepository.findUserByDobAfter(LocalDate.of(1980,01,01));
		assertThat(foundUser.size()).isEqualTo(9);
	}

	@Test
	public void canFindUserByNameStartingWith(){
		List<User> foundUser = userRepository.findUserByNameStartingWith("J");
		assertThat(foundUser.size()).isEqualTo(2);
	}

//	@Test
//	public void canFindUserByNameAndNameIgnoreCase(){
//		List<User> foundUser = userRepository.findUserByNameAndNameIgnoreCase("j");
//		assertThat(foundUser.size()).isEqualTo(1);
//	}

//	ANIME TESTS:
	@Test
	public void canFindAnimeByName(){
		List<Anime> foundAnime = animeRepository.findAnimeByName("Naruto");
		assertThat(foundAnime.size()).isEqualTo(1);
	}

	@Test
	public void canFindAnimeByReleaseDateGreaterThan(){
		List<Anime> foundAnime = animeRepository.findAnimeByReleaseDateGreaterThan(
				LocalDate.of(2004, 10, 05));
				assertThat(foundAnime.size()).isEqualTo(4);
	}

	@Test
	public void canFindAnimeByRatingGreaterThan(){
		List<Anime> foundAnime = animeRepository.findAnimeByRatingGreaterThan(4.5);
		assertThat(foundAnime.size()).isEqualTo(1);
	}

	@Test
	public void canFindAnimeByNumberOfEpsGreaterThan(){
		List<Anime> foundAnime = animeRepository.findAnimeByNumberOfEpsGreaterThan(50);
		assertThat(foundAnime.size()).isEqualTo(10);
	}

//	@Test
//	public void canFindAnimeByGenreId(){
//		List<Anime> foundAnime = animeRepository.findAnimeByGenreId(1L);
//		assertThat(foundAnime.size()).isEqualTo(1);
//	}
//	@Test
//	public void canFindAllByGenres_GenreName(){
//		List<Anime> foundAllAnimes = animeRepository.findAllByGenres_GenreName(1L);
//		assertThat(foundAllAnimes.size()).isEqualTo(2);
//	}

	@Test
	public void canFindAllByGenres(){

	}


}
