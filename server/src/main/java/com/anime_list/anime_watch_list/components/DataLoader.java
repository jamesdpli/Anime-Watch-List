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
                "Moments prior to Naruto Uzumaki's birth, a huge demon known as the Kyuubi, the " +
                        "Nine-Tailed Fox, attacked Konohagakure, the Hidden Leaf Village, and wreaked havoc. In " +
                        "order to put an end to the Kyuubi's rampage, the leader of the village, the Fourth Hokage, " +
                        "sacrificed his life and sealed the monstrous beast inside the newborn Naruto.\\nNow, " +
                        "Naruto is a hyperactive and knuckle-headed ninja still living in Konohagakure. Shunned " +
                        "because of the Kyuubi inside him, Naruto struggles to find his place in the village, " +
                        "while his burning desire to become the Hokage of Konohagakure leads him not only to some " +
                        "great new friends, but also some deadly foes.",  4.6, 500,
                "https://media.kitsu.io/anime/11/poster_image/small-db4debb693482e09f5d9615864b99b3d.jpeg");
        Anime anime2 = new Anime("Bleach", LocalDate.of(2004, 10, 05),
                "Ichigo Kurosaki is an ordinary high schooler—until his family is attacked by a Hollow, " +
                        "a corrupt spirit that seeks to devour human souls. It is then that he meets a Soul Reaper " +
                        "named Rukia Kuchiki, who gets injured while protecting Ichigo's family from the assailant. " +
                        "To save his family, Ichigo accepts Rukia's offer of taking her powers and becomes a Soul " +
                        "Reaper as a result.\\nHowever, as Rukia is unable to regain her powers, Ichigo is given " +
                        "the daunting task of hunting down the Hollows that plague their town. However, he is not " +
                        "alone in his fight, as he is later joined by his friends—classmates Orihime Inoue, " +
                        "Yasutora Sado, and Uryuu Ishida—who each have their own unique abilities. As Ichigo and " +
                        "his comrades get used to their new duties and support each other on and off the " +
                        "battlefield, the young Soul Reaper soon learns that the Hollows are not the only real " +
                        "threat to the human world.", 4.5, 366,
                "https://media.kitsu.io/anime/poster_images/244/small.jpg");
        Anime anime3 = new Anime("Attack on Titan", LocalDate.of(2013, 04, 07),
                "Centuries ago, mankind was slaughtered to near extinction by monstrous humanoid creatures" +
                        " called titans, forcing humans to hide in fear behind enormous concentric walls. What " +
                        "makes these giants truly terrifying is that their taste for human flesh is not born out " +
                        "of hunger but what appears to be out of pleasure. To ensure their survival, the remnants " +
                        "of humanity began living within defensive barriers, resulting in one hundred years without " +
                        "a single titan encounter. However, that fragile calm is soon shattered when a colossal " +
                        "titan manages to breach the supposedly impregnable outer wall, reigniting the fight for " +
                        "survival against the man-eating abominations.\\n\\nAfter witnessing a horrific personal " +
                        "loss at the hands of the invading creatures, Eren Yeager dedicates his life to their " +
                        "eradication by enlisting into the Survey Corps, an elite military unit that combats " +
                        "the merciless humanoids outside the protection of the walls. Based on Hajime Isayama's " +
                        "award-winning manga, Shingeki no Kyojin follows Eren, along with his adopted sister " +
                        "Mikasa Ackerman and his childhood friend Armin Arlert, as they join the brutal war " +
                        "against the titans and race to discover a way of defeating them before the last " +
                        "walls are breached.",  4.5, 86,
                "https://media.kitsu.io/anime/poster_images/7442/small.jpg");
        Anime anime4 = new Anime("One Piece", LocalDate.of(1999, 10, 03), "Pirates",  4.5, 1014);
        Anime anime5 = new Anime("Haikyuu", LocalDate.of(2014, 04, 06), "High school volley ball", 4.5, 73);
        Anime anime6 = new Anime("Kuroko's Basketball", LocalDate.of(2012, 04, 07), "High school basket ball team", 4.5, 75);
        Anime anime7 = new Anime("Bungo Stray Dogs", LocalDate.of(2016, 04, 07), "Detectives ", 4.5, 500);
        Anime anime8 = new Anime("Death Note", LocalDate.of(2002, 10, 03), "Ninja anime", 4.5, 500);
        Anime anime9 = new Anime("Slam Dunk", LocalDate.of(2002, 10, 03), "Ninja anime", 4.5, 500);
        Anime anime10 = new Anime("Jojo's Bizzare Adventure", LocalDate.of(2002, 10, 03), "Ninja anime", 4.5, 500);

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

        WatchList watchList1 = new WatchList(user1, anime1);
        WatchList watchList2 = new WatchList(user1, anime2);
        WatchList watchList3 = new WatchList(user1, anime3);
        WatchList watchList4 = new WatchList(user2, anime4);
        WatchList watchList5 = new WatchList(user2, anime5);

        animeRepository.saveAll(Arrays.asList(anime1, anime2, anime3, anime4, anime5, anime6, anime7, anime8, anime9, anime10));
        userRepository.saveAll(Arrays.asList(user1, user2, user3, user4, user5, user6, user7, user8, user9, user10, user11, user12));
        watchListRepository.saveAll(Arrays.asList(watchList1,watchList2,watchList3,watchList4,watchList5));
        genreRepository.saveAll(Arrays.asList(genre1, genre2, genre3));

    }
}
