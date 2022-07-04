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
        Anime naruto = new Anime("Naruto", LocalDate.of(2002, 10, 03),
                "Moments prior to Naruto Uzumaki's birth, a huge demon known as the Kyuubi, the Nine-Tailed " +
                        "Fox, attacked Konohagakure, the Hidden Leaf Village, and wreaked havoc. ",
                4.6, 500, true,
                "https://media.kitsu.io/anime/11/poster_image/small-db4debb693482e09f5d9615864b99b3d.jpeg",
                "https://media.kitsu.io/anime/cover_images/11/original.jpg");
        Anime narutoShippuden = new Anime("Naruto Shippuden", LocalDate.of(2007, 02, 15), "It " +
                "has been two and a half years since Naruto Uzumaki left Konohagakure, the Hidden Leaf Village, for " +
                "intense training following events which fueled his desire to be stronger.", 10, 500,
                true, "https://media.kitsu.io/anime/poster_images/1555/small.jpg",
                "https://media.kitsu.io/anime/cover_images/1555/original.jpg");
        Anime bleach = new Anime("Bleach", LocalDate.of(2004, 10, 05),
                "Ichigo Kurosaki is an ordinary high schooler—until his family is attacked by a Hollow, " +
                        "a corrupt spirit that seeks to devour human souls.",
                4.5, 366, false,
                "https://media.kitsu.io/anime/poster_images/244/small.jpg", "https://media.kitsu.io/anime/cover_images/244/original.jpg");
        Anime attackOnTitan = new Anime("Attack on Titan", LocalDate.of(2013, 04, 07),
                "Centuries ago, mankind was slaughtered to near extinction by monstrous humanoid creatures" +
                        " called titans, forcing humans to hide in fear behind enormous concentric walls.",
                4.5, 86, false,
                "https://media.kitsu.io/anime/poster_images/7442/small.jpg","https://media.kitsu.io/anime/cover_images/7442/original.png");
        Anime onePiece = new Anime("One Piece", LocalDate.of(1999, 10, 03),
                "Enter Monkey D. Luffy, a 17-year-old boy who defies your " +
                        "standard definition of a pirate.",  4.5, 1014, false,
                "https://media.kitsu.io/anime/poster_images/12/small.jpg","https://media.kitsu.io/anime/12/cover_image/21ecb556255bd46b95aea4779d19789f.jpg");
        Anime haikyuu = new Anime("Haikyuu", LocalDate.of(2014, 04, 06),
                "Inspired after watching a volleyball ace nicknamed \\\"Little Giant\\\" in action, " +
                        "small-statured Shouyou Hinata revives the volleyball club at his middle school.",
                4.5, 73, true,
                "https://media.kitsu.io/anime/poster_images/8133/small.jpg","https://media.kitsu.io/anime/cover_images/8133/original.jpg");
        Anime kurokosBasketball = new Anime("Kuroko's Basketball", LocalDate.of(2012, 04, 07),
                "Teikou Junior High School's basketball team is crowned champion three years in a row " +
                        "thanks to five outstanding players who, with their breathtaking and unique skills.",
                4.5, 75, true,
                "https://media.kitsu.io/anime/6595/poster_image/small-e15bd563bb282dce553074560247c421.jpeg",
                "https://media.kitsu.io/anime/cover_images/6595/original.jpg");
        Anime bungoStrayDogs2 = new Anime("Bungo Stray Dogs 2", LocalDate.of(2016, 04, 07),
                "Guild has entered Yokohoma city. Along with the city, they want Atsushi of The Armed " +
                        "Detective Agency too.",
                4.5, 500, true,
                "https://media.kitsu.io/anime/poster_images/11882/small.jpg",
                "https://media.kitsu.io/anime/cover_images/11882/original.jpg");
        Anime deathNote = new Anime("Death Note", LocalDate.of(2002, 10, 03),
                "A shinigami, as a god of death, can kill any person—provided they see their victim's face " +
                        "and write their victim's name in a notebook called a Death Note.",
                4.5, 500, true,
                "https://media.kitsu.io/anime/poster_images/1376/small.jpg",
                "https://media.kitsu.io/anime/cover_images/1376/original.jpg");
        Anime slamDunk = new Anime("Slam Dunk", LocalDate.of(2002, 10, 03),
                "Hanamichi Sakuragi, infamous for this temper, massive height, and fire-red hair, enrolls " +
                        "in Shohoku High, hoping to finally get a girlfriend and break his record of being rejected " +
                        "50 consecutive times in middle school.",
                4.5, 500, true,
                "https://media.kitsu.io/anime/poster_images/148/small.jpg",
                "https://media.kitsu.io/anime/cover_images/148/original.jpg");
        Anime jojosBizzareAdventure2012 = new Anime("Jojo's Bizzare Adventure 2012", LocalDate.of(2002, 10, 03),
                "In 1868, Dario Brando saves the life of an English nobleman, George Joestar. By taking in Dario's " +
                        "son Dio when the boy becomes fatherless, George hopes to repay the debt he owes to his " +
                        "savior.",
                4.5, 500, true,
                "https://media.kitsu.io/anime/7158/poster_image/small-bde68eb96267be7833813f3a85b68df0.jpeg",
                "https://media.kitsu.io/anime/cover_images/7158/original.png");
        Anime onePunchMan = new Anime("One Punch man", LocalDate.of(2015,10,05),"test",
                4.5,500, false,"https://media.kitsu.io/anime/poster_images/10740/small.jpg",
                "https://media.kitsu.io/anime/cover_images/10740/original.jpg");
        Anime assinationClassroom = new Anime("Assassination Classroom", LocalDate.of(2015,10,05),"test",
                4.5,500, false,"https://media.kitsu.io/anime/poster_images/8640/small.jpg",
                "https://media.kitsu.io/anime/cover_images/8640/original.jpg");
        Anime mobPsycho100 = new Anime("Mob Psycho 100", LocalDate.of(2015,10,05),"test",
                4.5,500, false,"https://media.kitsu.io/anime/41071/poster_image/medium-a4eb2d884a8d4ff6498113309c97f0da.jpeg","https://media.kitsu.io/anime/cover_images/41071/original.jpg" );
        Anime blackClover = new Anime("Black Clover", LocalDate.of(2015,10,05),"test",
                4.5,500, false,"https://media.kitsu.io/anime/poster_images/13209/medium.jpg",
                "https://media.kitsu.io/anime/cover_images/789/original.jpeg");
        Anime dragonBall = new Anime("Dragon Ball", LocalDate.of(1986, 02, 26),
                "Gokuu Son is a young boy who lives in the woods all alone—that is, until a girl named Bulma runs into" +
                " him in her search for a set of magical objects called the \\\"Dragon Balls.\\",8.8,
                153, true, "https://media.kitsu.io/anime/poster_images/199/small.jpg",
                "https://media.kitsu.io/anime/cover_images/199/large.jpg");
        Anime dragonBallZ = new Anime("Dragon ball Z", LocalDate.of(1989, 04, 26), "Five years" +
                " after the events of Dragon Ball, martial arts expert Gokuu is now a grown man married to his wife " +
                "Chi-Chi, with a four-year old son named Gohan.", 7.9, 291, true,
                "https://media.kitsu.io/anime/poster_images/4394/small.jpg", "https://media.kitsu.io/anime/cover_images/4394/large.jpg");
        Anime yuyuHakusho = new Anime("Yu Yu Hakusho", LocalDate.of(1992, 10, 8), "One fateful " +
                "day, Yuusuke Urameshi, a 14-year-old delinquent with a dim future, gets a miraculous chance to turn " +
                "it all around when he throws himself in front of a moving car to save a young boy.", 9.9, 112, true,
                "https://media.kitsu.io/anime/poster_images/359/small.jpg",
                "https://media.kitsu.io/anime/cover_images/359/original.jpg");
        Anime gintama = new Anime("Gintama", LocalDate.of(2006, 04, 04), "The Amanto, aliens " +
                "from outer space, have invaded Earth and taken over feudal Japan. As a result, a prohibition on " +
                "swords has been established, and the samurai of Japan are treated with disregard as a consequence.", 6.1,
                267, true, "https://media.kitsu.io/anime/poster_images/818/small.jpg",
                "https://media.kitsu.io/anime/cover_images/818/large.jpg");
        Anime hunterXHunter = new Anime("Hunter X Hunter", LocalDate.of(2011, 10, 02), "Hunters" +
                " are specialized in a wide variety of fields, ranging from treasure hunting to cooking. They have " +
                "access to otherwise unavailable funds and information that allow them to pursue their dreams and " +
                "interests.", 5.1, 148, false, "https://media.kitsu.io/anime/poster_images/115/small.jpg",
                "https://media.kitsu.io/anime/cover_images/115/original.png");
        Anime inuyasha = new Anime("Inuyasha", LocalDate.of(2000, 10, 16), "InuYasha follows " +
                "Kagome Higurashi, a fifteen-year-old girl whose normal life ends when a demon drags her into a cursed" +
                " well on the grounds of her family's Shinto shrine.", 8.7, 167, true,
                "https://media.kitsu.io/anime/poster_images/224/small.jpg",
                "https://media.kitsu.io/anime/cover_images/224/large.jpg");
        Anime fullMetalAlchemists = new Anime("Full Metal Alchemists", LocalDate.of(2003, 10, 04),
                "Edward Elric, a young, brilliant alchemist, has lost much in his twelve-year life: when he and his " +
                        "brother Alphonse try to resurrect their dead mother through the forbidden act of human " +
                        "transmutation.", 10, 51, true,
                "https://media.kitsu.io/anime/poster_images/100/small.jpg",
                "https://media.kitsu.io/anime/cover_images/100/large.jpg");
        Anime trigun = new Anime("Trigun", LocalDate.of(1998, 04, 01), "Vash the Stampede is " +
                "the man with a $$60,000,000 bounty on his head. The reason: he's a merciless villain who lays waste " +
                "to all those that oppose him and flattens entire cities for fun, garnering him the title " +
                "\\\"The Humanoid Typhoon.", 7.5, 26, true,
                "https://media.kitsu.io/anime/3/poster_image/small-8b8e908c4f3dd2ea581b5c93957fba02.jpeg",
                "https://media.kitsu.io/anime/cover_images/3/large.jpg");
        Anime myHeroAcademia = new Anime("My Hero Academia", LocalDate.of(2016, 07, 07), "What" +
                " would the world be like if 80 percent of the population manifested extraordinary superpowers called" +
                " “Quirks” at age four? Heroes and villains would be battling it out everywhere!", 3.2, 113, false,
                "https://media.kitsu.io/anime/poster_images/11469/small.jpg",
                "https://media.kitsu.io/anime/cover_images/11469/large.jpg");
        Anime neonGenisisEvangelion = new Anime("Neon Genesis Evangelion", LocalDate.of(1995, 10, 04),
                "In the year 2015, the world stands on the brink of destruction. Humanity's last hope lies in the hands" +
                        " of Nerv, a special agency under the United Nations, and their Evangelions, giant machines" +
                        " capable of defeating the Angels who herald Earth's ruin.", 8.8, 26, true,
                "https://media.kitsu.io/anime/21/poster_image/small-6662f66b53b64098d873e037b3f59bd2.jpeg",
                "https://media.kitsu.io/anime/cover_images/21/large.jpg");
        Anime cowboyBebop = new Anime("Cowboy Bebop", LocalDate.of(1998, 04, 03), "In the year" +
                " 2071, humanity has colonized several of the planets and moons of the solar system leaving the now" +
                " uninhabitable surface of planet Earth behind.",
                6.9, 26, true,
                "https://media.kitsu.io/anime/poster_images/1/small.jpg",
                "https://media.kitsu.io/anime/1/cover_image/large-88da0208ac7fdd1a978de8b539008bd8.jpeg");
        Anime aPromisedNeverland = new Anime("A Promised Neverland", LocalDate.of(2019, 01, 10),
                "The orphans at Grace Field House have only ever known peace. Their home is nice, their bellies stay" +
                        " full, and their caretaker, Mom, loves them very much. " ,7.1, 12, false,
                "https://media.kitsu.io/anime/poster_images/41312/small.jpg",
                "https://media.kitsu.io/anime/cover_images/41312/original.png");
        Anime sailorMoon = new Anime("Sailor Moon", LocalDate.of(1992, 03, 07), "Tsukino Usagi " +
                "is a 14-year-old girl in junior high. She's ditzy, whiny, and a crybaby. She often flunks her tests," +
                " and she is always scolded by her family.", 10, 200, true,
                "https://media.kitsu.io/anime/489/poster_image/small-31a022984f9712f7242a5957a0d32888.jpeg",
                "https://media.kitsu.io/anime/cover_images/489/large.jpg");
        Anime cardCaptorSakura = new Anime("Cardcaptor Sakura", LocalDate.of(1999, 8, 21), "akura " +
                "Kinomoto is your garden-variety fourth grader, one day, she stumbles upon a " +
                "mysterious book containing a set of cards. The " +
                "cards mean because she accidentally stirs up a magical gust of wind and unintentionally scatters" +
                " the cards over the world.", 7.1, 70, true,
                "https://media.kitsu.io/anime/poster_images/207/small.jpg",
                "https://media.kitsu.io/anime/cover_images/207/large.jpg");
        Anime fairyTale = new Anime("Fairy Tail", LocalDate.of(2009, 10, 12), "A superficial" +
                " but kind-hearted celestial mage, Lucy Heartfilia, joins a famous wizarding guild in Magnolia Town" +
                " called Fairy Tail, where the members use their powers to earn rewards in exchange for fulfilling" +
                " quests.", 1.1, 328, true,
                "https://media.kitsu.io/anime/poster_images/4676/small.jpg",
                "https://media.kitsu.io/anime/cover_images/4676/large.jpg");
        Anime goldenBoy = new Anime("Golden Boy", LocalDate.of(1995, 01 ,20), "Kintarou Ooe is a specialist in part-time" +
                " work, riding all over the highways and byways of Japan on his trusty steed, the Mikazuki 5, " +
                "and finding employment wherever he can.", 10, 6, true,
                "https://media.kitsu.io/anime/poster_images/243/small.jpg",
                "https://media.kitsu.io/anime/cover_images/243/large.jpg");

//      Add Genre
        Genre comedy = new Genre("Comedy", Arrays.asList(naruto, bleach, attackOnTitan, onePunchMan, assinationClassroom, mobPsycho100, blackClover));
        Genre action = new Genre("Action", Arrays.asList(naruto, bungoStrayDogs2, attackOnTitan, onePunchMan, assinationClassroom, mobPsycho100, blackClover));
        Genre ecchi = new Genre("Ecchi", Arrays.asList(onePiece, bleach, attackOnTitan, deathNote));
        Genre sports = new Genre("Sports", Arrays.asList(slamDunk));
        Genre adventure = new Genre("Adventure", Arrays.asList(jojosBizzareAdventure2012));
        Genre supernatural = new Genre("Supernatural", Arrays.asList(jojosBizzareAdventure2012, mobPsycho100));
        Genre fantasy = new Genre("Fantasy", Arrays.asList(blackClover));

//      Add User
        User user1 = new User("Onoda", LocalDate.of(1999,9,2), "onodaKun@gmail.com", "kangaboo23!");
        User user2 = new User("John", LocalDate.of(1959,6,25),"lol@gmail.com","bomba345");
        User user3 = new User("Rem", LocalDate.of(2001,9,4), "Kem@gmail.com","madman76!");
        User user4 = new User("Jenny", LocalDate.of(1969,3,27), "janjenny@gmail.com", "gangnam45!");
        User user5 = new User("Shiki", LocalDate.of(1999,9,14), "Shiki43@gmail.com", "tokyorevengers22");
        User user6 = new User("Randy", LocalDate.of(1599,5,15), "Randy432@gmail.com", "bossgyal45");
        User user7 = new User("Shuka", LocalDate.of(1999,9,2), "onodaKun@gmail.com", "ganggang1!");
        User user8 = new User("Obu", LocalDate.of(2003,9,3), "ObiObi@gmail.com","whiskers89");
        User user9 = new User("Kite", LocalDate.of(1998,6,6), "Kie7673@gmail.com", "1derland!");
        User user10 = new User("Pete", LocalDate.of(1987,9,23), "PITY@gmail.com","bambideer2");
        User user11 = new User("Kwnichi", LocalDate.of(1989,6,24), "koitd@gmail.com", "raahted20");
        User user12 = new User("Quinnie", LocalDate.of(2001,9,2), "qunie432@gmail.com", "quebec203");

//      Add WatchList
        WatchList watchList1 = new WatchList(user1, naruto);
        WatchList watchList2 = new WatchList(user1, bleach);
        WatchList watchList3 = new WatchList(user1, attackOnTitan);
        WatchList watchList4 = new WatchList(user2, onePiece);
        WatchList watchList5 = new WatchList(user2, haikyuu);
        WatchList watchList6 = new WatchList(user2, kurokosBasketball);
        WatchList watchList7 = new WatchList(user3, haikyuu);
        WatchList watchList8 = new WatchList(user3, deathNote);
        WatchList watchList9 = new WatchList(user3, jojosBizzareAdventure2012);
        WatchList watchList10 = new WatchList(user4, kurokosBasketball);
        WatchList watchList11 = new WatchList(user4, bungoStrayDogs2);
        WatchList watchList12 = new WatchList(user4, attackOnTitan);
        WatchList watchList13 = new WatchList(user5, slamDunk);
        WatchList watchList14 = new WatchList(user5, naruto);
        WatchList watchList15 = new WatchList(user5, jojosBizzareAdventure2012);
        WatchList watchList16 = new WatchList(user6, bleach);
        WatchList watchList17 = new WatchList(user6, onePiece);
        WatchList watchList18 = new WatchList(user6, deathNote);
        WatchList watchList19 = new WatchList(user7, attackOnTitan);
        WatchList watchList20 = new WatchList(user7, deathNote);
        WatchList watchList21 = new WatchList(user7, jojosBizzareAdventure2012);
        WatchList watchList22 = new WatchList(user8, bleach);
        WatchList watchList23 = new WatchList(user8, onePiece);
        WatchList watchList24 = new WatchList(user8, haikyuu);
        WatchList watchList25 = new WatchList(user9, deathNote);
        WatchList watchList26 = new WatchList(user10, naruto);
        WatchList watchList27 = new WatchList(user11, jojosBizzareAdventure2012);
        WatchList watchList28 = new WatchList(user12, kurokosBasketball);
        WatchList watchList29 = new WatchList(user12, onePiece);
        WatchList watchList30 = new WatchList(user12, bleach);

//      Save models
        animeRepository.saveAll(Arrays.asList(naruto, narutoShippuden, bleach, attackOnTitan, onePiece, haikyuu, kurokosBasketball,
                bungoStrayDogs2, deathNote, slamDunk, jojosBizzareAdventure2012, onePunchMan, assinationClassroom,
                mobPsycho100, blackClover, dragonBall, dragonBallZ, yuyuHakusho, gintama, hunterXHunter, inuyasha, fullMetalAlchemists,
                trigun, neonGenisisEvangelion, cowboyBebop, aPromisedNeverland, sailorMoon, cardCaptorSakura, fairyTale, goldenBoy));
        userRepository.saveAll(Arrays.asList(user1, user2, user3, user4, user5, user6, user7, user8, user9, user10,
                user11, user12));
        watchListRepository.saveAll(Arrays.asList(watchList1,watchList2,watchList3,watchList4,watchList5, watchList6,
                watchList7, watchList8, watchList9, watchList10, watchList11, watchList12, watchList13, watchList14,
                watchList15,watchList16, watchList17, watchList18,watchList19,watchList20,watchList21, watchList22,
                watchList23, watchList24, watchList25, watchList26, watchList27,watchList28, watchList29, watchList30));
        genreRepository.saveAll(Arrays.asList(comedy, action, ecchi, sports, adventure, supernatural, fantasy));
    }
}
