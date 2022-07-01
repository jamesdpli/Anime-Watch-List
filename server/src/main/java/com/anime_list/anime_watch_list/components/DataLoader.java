package com.anime_list.anime_watch_list.components;


import com.anime_list.anime_watch_list.models.Anime;
import com.anime_list.anime_watch_list.models.Genre;
import com.anime_list.anime_watch_list.models.User;
import com.anime_list.anime_watch_list.models.WatchList;
import com.anime_list.anime_watch_list.repositroies.AnimeRepository;
import com.anime_list.anime_watch_list.repositroies.GenreRepository;
import com.anime_list.anime_watch_list.repositroies.UserRepository;
import com.anime_list.anime_watch_list.repositroies.WatchListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    AnimeRepository animeRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    WatchListRepository watchListRepository;

    @Autowired
    GenreRepository genreRepository;

    @Override
    public void run (ApplicationArguments args) throws Exception {

//      Add Anime
        Anime anime1 = new Anime("Naruto", LocalDate.of(2002, 10, 03),
                "Moments prior to Naruto Uzumaki's birth, a huge demon known as the Kyuubi, the Nine-Tailed " +
                        "Fox, attacked Konohagakure, the Hidden Leaf Village, and wreaked havoc. ",
                4.6, 500,
                "https://media.kitsu.io/anime/11/poster_image/small-db4debb693482e09f5d9615864b99b3d.jpeg");
        Anime anime2 = new Anime("Bleach", LocalDate.of(2004, 10, 05),
                "Ichigo Kurosaki is an ordinary high schooler—until his family is attacked by a Hollow, " +
                        "a corrupt spirit that seeks to devour human souls.",
                4.5, 366,
                "https://media.kitsu.io/anime/poster_images/244/small.jpg");
        Anime anime3 = new Anime("Attack on Titan", LocalDate.of(2013, 04, 07),
                "Centuries ago, mankind was slaughtered to near extinction by monstrous humanoid creatures" +
                        " called titans, forcing humans to hide in fear behind enormous concentric walls.",
                4.5, 86,
                "https://media.kitsu.io/anime/poster_images/7442/small.jpg");
        Anime anime4 = new Anime("One Piece", LocalDate.of(1999, 10, 03),
                "Enter Monkey D. Luffy, a 17-year-old boy who defies your " +
                        "standard definition of a pirate.",  4.5, 1014,
                "https://media.kitsu.io/anime/poster_images/12/small.jpg");
        Anime anime5 = new Anime("Haikyuu", LocalDate.of(2014, 04, 06),
                "Inspired after watching a volleyball ace nicknamed \\\"Little Giant\\\" in action, " +
                        "small-statured Shouyou Hinata revives the volleyball club at his middle school.",
                4.5, 73,
                "https://media.kitsu.io/anime/poster_images/8133/small.jpg");
        Anime anime6 = new Anime("Kuroko's Basketball", LocalDate.of(2012, 04, 07),
                "Teikou Junior High School's basketball team is crowned champion three years in a row " +
                        "thanks to five outstanding players who, with their breathtaking and unique skills.",
                4.5, 75,
                "https://media.kitsu.io/anime/6595/poster_image/small-e15bd563bb282dce553074560247c421.jpeg");
        Anime anime7 = new Anime("Bungo Stray Dogs 2", LocalDate.of(2016, 04, 07),
                "Guild has entered Yokohoma city. Along with the city, they want Atsushi of The Armed " +
                        "Detective Agency too.",
                4.5, 500,
                "https://media.kitsu.io/anime/poster_images/11882/small.jpg");
        Anime anime8 = new Anime("Death Note", LocalDate.of(2002, 10, 03),
                "A shinigami, as a god of death, can kill any person—provided they see their victim's face " +
                        "and write their victim's name in a notebook called a Death Note.",
                4.5, 500,
                "https://media.kitsu.io/anime/poster_images/1376/small.jpg");
        Anime anime9 = new Anime("Slam Dunk", LocalDate.of(2002, 10, 03),
                "Hanamichi Sakuragi, infamous for this temper, massive height, and fire-red hair, enrolls " +
                        "in Shohoku High, hoping to finally get a girlfriend and break his record of being rejected " +
                        "50 consecutive times in middle school.",
                4.5, 500,
                "https://media.kitsu.io/anime/poster_images/148/small.jpg");
        Anime anime10 = new Anime("Jojo's Bizzare Adventure 2012", LocalDate.of(2002, 10, 03),
                "In 1868, Dario Brando saves the life of an English nobleman, George Joestar. By taking in Dario's " +
                        "son Dio when the boy becomes fatherless, George hopes to repay the debt he owes to his " +
                        "savior.",
                4.5, 500,
                "https://media.kitsu.io/anime/7158/poster_image/small-bde68eb96267be7833813f3a85b68df0.jpeg");

//      Add Genre
        Genre genre1 = new Genre("comedy", Arrays.asList(anime1,anime2,anime3));
        Genre genre2 = new Genre("Action", Arrays.asList(anime1,anime7,anime3));
        Genre genre3 = new Genre("Ecchi", Arrays.asList(anime4,anime2,anime3, anime8));

//      Add User
        User user1 = new User("Onoda", LocalDate.of(1999,9,2), "onodaKun@gmail.com");
        User user2 = new User("John", LocalDate.of(1959,6,25),"lol@gmail.com");
        User user3 = new User("Rem", LocalDate.of(2001,9,4), "Kem@gmail.com");
        User user4 = new User("Jenny", LocalDate.of(1969,3,27), "janjenny@gmail.com");
        User user5 = new User("Shiki", LocalDate.of(1999,9,14), "Shiki43@gmail.com");
        User user6 = new User("Randy", LocalDate.of(1599,5,15), "Randy432@gmail.com");
        User user7 = new User("Shuka", LocalDate.of(1999,9,2), "onodaKun@gmail.com");
        User user8 = new User("Obu", LocalDate.of(2003,9,3), "ObiObi@gmail.com");
        User user9 = new User("Kite", LocalDate.of(1998,6,6), "Kie7673@gmail.com");
        User user10 = new User("Pete", LocalDate.of(1987,9,23), "PITY@gmail.com");
        User user11 = new User("Kwnichi", LocalDate.of(1989,6,24), "koitd@gmail.com");
        User user12 = new User("Quinnie", LocalDate.of(2001,9,2), "qunie432@gmail.com");

//      Add WatchList
        WatchList watchList1 = new WatchList(user1, anime1);
        WatchList watchList2 = new WatchList(user1, anime2);
        WatchList watchList3 = new WatchList(user1, anime3);
        WatchList watchList4 = new WatchList(user2, anime4);
        WatchList watchList5 = new WatchList(user2, anime5);

//      Save models
        animeRepository.saveAll(Arrays.asList(anime1, anime2, anime3, anime4, anime5, anime6, anime7, anime8, anime9, anime10));
        animeRepository.saveAll(Arrays.asList(anime1));
        userRepository.saveAll(Arrays.asList(user1, user2, user3, user4, user5, user6, user7, user8, user9, user10, user11, user12));
        watchListRepository.saveAll(Arrays.asList(watchList1,watchList2,watchList3,watchList4,watchList5));
        genreRepository.saveAll(Arrays.asList(genre1, genre2, genre3));

    }
}
