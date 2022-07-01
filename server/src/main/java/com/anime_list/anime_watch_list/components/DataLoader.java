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
        Anime anime4 = new Anime("One Piece", LocalDate.of(1999, 10, 03),
                "Gol D. Roger was known as the \\\"Pirate King,\\\" the strongest and most infamous being " +
                        "to have sailed the Grand Line. The capture and death of Roger by the World Government " +
                        "brought a change throughout the world. His last words before his death revealed the" +
                        " existence of the greatest treasure in the world, One Piece. It was this revelation that " +
                        "brought about the Grand Age of Pirates, men who dreamed of finding One Piece—which promises " +
                        "an unlimited amount of riches and fame—and quite possibly the pinnacle of glory and the " +
                        "title of the Pirate King.\\nEnter Monkey D. Luffy, a 17-year-old boy who defies your " +
                        "standard definition of a pirate. Rather than the popular persona of a wicked, hardened, " +
                        "toothless pirate ransacking villages for fun, Luffy’s reason for being a pirate is one of " +
                        "pure wonder: the thought of an exciting adventure that leads him to intriguing people and " +
                        "ultimately, the promised treasure. Following in the footsteps of his childhood hero, Luffy" +
                        " and his crew travel across the Grand Line, experiencing crazy adventures, unveiling dark " +
                        "mysteries and battling strong enemies, all in order to reach the most coveted of all " +
                        "fortunes—One Piece.",  4.5, 1014,
                "https://media.kitsu.io/anime/poster_images/12/small.jpg");
        Anime anime5 = new Anime("Haikyuu", LocalDate.of(2014, 04, 06),
                "Inspired after watching a volleyball ace nicknamed \\\"Little Giant\\\" in action, " +
                        "small-statured Shouyou Hinata revives the volleyball club at his middle school. The " +
                        "newly-formed team even makes it to a tournament; however, their first match turns out to be " +
                        "their last when they are brutally squashed by the \\\"King of the Court,\\\" Tobio " +
                        "Kageyama. Hinata vows to surpass Kageyama, and so after graduating from middle school, he" +
                        " joins Karasuno High School's volleyball team—only to find that his sworn rival, Kageyama, " +
                        "is now his teammate.\\n\\nThanks to his short height, Hinata struggles to find his role on " +
                        "the team, even with his superior jumping power. Surprisingly, Kageyama has his own problems " +
                        "that only Hinata can help with, and learning to work together appears to be the only way " +
                        "for the team to be successful. Based on Haruichi Furudate's popular shounen manga of the" +
                        " same name, Haikyuu!! is an exhilarating and emotional sports comedy following two " +
                        "determined athletes as they attempt to patch a heated rivalry in order to make their high" +
                        " school volleyball team the best in Japan.", 4.5, 73,
                "https://media.kitsu.io/anime/poster_images/8133/small.jpg");
        Anime anime6 = new Anime("Kuroko's Basketball", LocalDate.of(2012, 04, 07),
                "Teikou Junior High School's basketball team is crowned champion three years in a row " +
                        "thanks to five outstanding players who, with their breathtaking and unique skills, leave " +
                        "opponents in despair and fans in admiration. However, after graduating, these teammates, " +
                        "known as \\\"The Generation of Miracles,\\\" go their separate ways and now consider each " +
                        "other as rivals.\\nAt Seirin High School, two newly recruited freshmen prove that they are " +
                        "not ordinary basketball players: Taiga Kagami, a promising player returning from the US, " +
                        "and Tetsuya Kuroko, a seemingly ordinary student whose lack of presence allows him to move " +
                        "around unnoticed. Although Kuroko is neither athletic nor able to score any points, he was " +
                        "a member of Teikou's basketball team, where he played as the \\\"Phantom Sixth Man,\\\" who " +
                        "easily passed the ball and assisted his teammates.Kuroko no Basket follows the journey of" +
                        "Seirin's players as they attempt to become the best Japanese high school team by winning " +
                        "the Interhigh Championship. To reach their goal, they have to cross pathways with several " +
                        "powerful teams, some of which have one of the five players with godlike abilities, whom " +
                        "Kuroko and Taiga make a pact to defeat.", 4.5, 75,
                "https://media.kitsu.io/anime/6595/poster_image/small-e15bd563bb282dce553074560247c421.jpeg");
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
