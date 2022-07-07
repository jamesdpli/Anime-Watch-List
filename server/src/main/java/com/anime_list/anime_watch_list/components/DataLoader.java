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
                "https://media.kitsu.io/anime/cover_images/13209/large.jpg");
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





//        extras
        Anime terrorInResonance = new Anime("Terror in Resonance",LocalDate.of(2014, 07, 10), "Painted in red, the word VON" +
                " is all that is left behind after a terrorist attack on a nuclear facility in Japan. The government is shattered by " +
                " their inability to act, and the police are left frantically searching for ways to crack down the perpetrators.", 7.8, 11, true,
                "https://media.kitsu.io/anime/poster_images/8342/small.jpg", "https://media.kitsu.io/anime/cover_images/8342/large.jpg");
//        SPORTS
        Anime hajimeNoIppo = new Anime("Hajime no Ippo", LocalDate.of(2000, 10,03),
                "Makunouchi Ippo has been bullied his entire life. Constantly running errands and being beaten up by his classmates, " +
                        "Ippo has always dreamed of changing himself, but never has the passion to act upon it.",
                7.8, 76, true, "https://media.kitsu.io/anime/poster_images/238/small.jpg",
                "https://media.kitsu.io/anime/cover_images/238/large.jpg");
        Anime free = new Anime("Free!", LocalDate.of(2013, 07, 04), "Haruka Nanase has a love for water and a passion for swimming. In elementary " +
                "school, he competed in and won a relay race with his three friends Rin Matsuoka, Nagisa Hazuki, and Makoto Tachibana. ", 7.3, 39, true,
                "https://media.kitsu.io/anime/poster_images/7664/small.jpg", "https://media.kitsu.io/anime/cover_images/7664/large.jpg" );
        Anime yuriOnIce = new Anime("Yuri!!! On Ice", LocalDate.of(2016, 10, 06),
                "Reeling from his crushing defeat at the Grand Prix Finale, Yuuri Katsuki, once Japan's most promising figure skater, " +
                        "returns to his family home to assess his options for the future. At age 23, Yuuri's window for success in skating is closing rapidly,", 8.3, 12, true,
                "https://media.kitsu.io/anime/poster_images/11999/small.jpg","https://media.kitsu.io/anime/cover_images/11999/large.jpg");
        Anime pingPong = new Anime ("Ping Pong", LocalDate.of(2014, 04, 11),
                "The hero comes. The hero comes. The hero comes. Chant these words in your mind, and I'll surely come to you. " +
                        "This mantra is what Makoto Tsukimoto repeats as a source of motivation when he fights through the stress of not only grueling ping pong ",
                8.6, 11, true, "https://media.kitsu.io/anime/poster_images/8262/small.jpg", "https://media.kitsu.io/anime/cover_images/8262/large.jpg");
        Anime chihayafuru = new Anime("Chihayafuru", LocalDate.of(2011, 10, 04),
                "Chihaya Ayase, a strong-willed and tomboyish girl, grows up under the shadow of her older sister. With no dreams of her own, she is contented with" +
                        " her share in life till she meets Arata Wataya. The quiet transfer student in her elementary class introduces",
                8.1, 74, true, "https://media.kitsu.io/anime/poster_images/6355/small.jpg", "https://media.kitsu.io/anime/cover_images/6355/large.jpg");
        Anime sk8TheInfinity = new Anime ("SK8 the Infinity", LocalDate.of(2021, 01, 10),
                "Reki a high school sophomore and skater, is addicted to 'S'  a highly secret and dangerous downhill skateboarding" +
                        " race that takes place in an abandoned mine. The skaters are especially wild about the beefs, or heated battles that erupt in the races.",
                8.0, 12, false,
                "https://media.kitsu.io/anime/poster_images/43595/small.jpg", "https://media.kitsu.io/anime/cover_images/43595/large.jpg");
//        MYSTERY
        Anime another = new Anime ("Another", LocalDate.of(2012, 01, 9),
                "In 1972, a popular student in Yomiyama North Middle School's class 3-3 named Misaki passed away during the school year." +
                        " Since then, the town of Yomiyama has been shrouded by a fearful atmosphere, from the dark secrets hidden deep within.",
                7.5, 12, true, "https://media.kitsu.io/anime/poster_images/6462/small.jpg", "https://media.kitsu.io/anime/cover_images/6462/large.jpg");
        Anime theMelancholyOfHaruhiSuzumiya = new Anime("The Melancholy of Haruhi Suzumiya", LocalDate.of(2006, 04, 02),
                "A parody series featuring the entire cast of The Melancholy of Haruhi Suzumiya in a smaller form factor." +
                        "  Among the changes Yuki plays eroge, Haruhi is even more obnoxiuous and loud, Mikuru is even more emotional and Koizumi harbors a deep love for Kyon.",
                7.8, 28, true, "https://media.kitsu.io/anime/poster_images/3939/small.jpg", "https://media.kitsu.io/anime/cover_images/3939/large.jpg");
        Anime gosick = new Anime("Gosick", LocalDate.of(2011, 01, 07),
                "Kazuya Kujou is a foreign student at Saint Marguerite Academy, a luxurious boarding school in the Southern European" +
                        " country of Sauville. His jet-black hair and dark brown eyes cause his peers to shun him and give him the nickname Black Reaper",
                8.1, 24, true, "https://media.kitsu.io/anime/poster_images/5330/small.jpg", "https://media.kitsu.io/anime/cover_images/5330/large.jpg");
        Anime mononoke = new Anime("Mononoke", LocalDate.of(2001, 10, 19),
                "The Medicine Seller is a deadly and mysterious master of the occult who travels across feudal Japan in search of malevolent" +
                        " spirits called mononoke to slay. When he locates one of these spirits, he cannot simply kill it, he must first learn its Form,",
                8.4, 12, true, "https://media.kitsu.io/anime/poster_images/2035/small.jpg", "https://media.kitsu.io/anime/cover_images/2035/large.jpg");
        Anime boogiepopPhantom = new Anime("Boogiepop Phantom", LocalDate.of(2000, 01, 05),
                "Five years ago, a string of grisly murders shook the city to its core and now the rumors have begun once more. " +
                        "Boogiepop... Everyone knows about Boogiepop: meet her one dark night and you are taken. People tell each other the stories and laugh",
                8.4, 25, false, "https://media.kitsu.io/anime/poster_images/336/small.jpg", "https://media.kitsu.io/anime/cover_images/336/large.jpg");
//        DRAMA
        Anime bluePeriod = new Anime("Blue Period", LocalDate.of(2021, 9,25),
                "Bored with life, popular high schooler Yatora Yaguchi jumps into the beautiful yet unrelenting world of art after finding inspiration in a painting." +
                        "(Source: Netflix)Note: The anime had an early premiere on Netflix on Sep 25, 2021 in Japan.",
                7.7, 12, true, "https://media.kitsu.io/anime/43888/poster_image/small-d70270972417b82ed02e145ceba18944.jpeg",
                "https://media.kitsu.io/anime/cover_images/43888/large.jpg");
        Anime violetEvergarden = new Anime("Violet Evergarden", LocalDate.of(2019, 9, 06),
                "There are words Violet heard on the battlefield, which she cannot forget. These words were given to her by someone she holds dear," +
                        " more than anyone else. She does not yet know their meaning.\\nA certain point in time, in the continent of Telesis.",
                8.4, 13, true, "https://media.kitsu.io/anime/poster_images/12230/small.jpg", "https://media.kitsu.io/anime/cover_images/12230/large.jpg");
        Anime ninetyOneDays = new Anime("91 Days", LocalDate.of(2016, 07, 06),
                "During Prohibition, the law held no power and the mafia ruled the town. The story takes place in Lawless," +
                        " a town thriving on black market sales of illicitly brewed liquor. One day Avilio receives a letter from a mysterious sender  prompting him to return",
                7.7, 12, true, "https://media.kitsu.io/anime/poster_images/11957/small.jpg", "https://media.kitsu.io/anime/cover_images/11957/large.jpg");
        Anime claymore = new Anime("Claymore", LocalDate.of(2007, 04, 03),
                "In this world, humans coexist with demonic predators called Yoma. These demonic beasts feast on human innards and" +
                        " can blend into human society by taking on human appearance. As a counter force, a mysterious organization created half-human,",
                8.0, 26, true, "https://media.kitsu.io/anime/poster_images/1635/small.jpg", "https://media.kitsu.io/anime/cover_images/1635/large.jpg");
        Anime steinsGate = new Anime("Steins;Gate", LocalDate.of(2011, 04, 06),
                "The self-proclaimed mad scientist Rintarou Okabe rents out a room in a rickety old building in Akihabara where he indulges" +
                        " himself in his hobby of inventing prospective future gadgets with fellow lab members Mayuri Shiina, his air-headed childhood friend",
                9.1, 26, true, "https://media.kitsu.io/anime/poster_images/5646/small.jpg", "https://media.kitsu.io/anime/cover_images/5646/large.jpg");
        Anime tokyoRevengers = new Anime("Tokyo Revengers", LocalDate.of(2021, 04, 11),
                "Takemichi Hanagaki is a freelancer that's reached the absolute pits of despair in his life. He finds out that the only girlfriend" +
                        " he ever had, in middle school, Hinata Tachibana, had been killed by the ruthless Tokyo Manji Gang.",
                8.1, 24, false, "https://media.kitsu.io/anime/poster_images/43321/small.jpg", "https://media.kitsu.io/anime/cover_images/43321/large.jpg");
//        SUPERNATURAL
        Anime angelBeats = new Anime("Angel Beats", LocalDate.of(2010, 04, 03),
                "Otonashi awakens only to learn he is dead. A rifle-toting girl named Yuri explains that they are in the afterlife, and Otonashi realizes the only thing he can remember"+
                        " about himself is his name.",
                7.6, 13, true, "https://media.kitsu.io/anime/poster_images/4604/small.jpg", "https://media.kitsu.io/anime/cover_images/4604/large.jpg");
        Anime saikiK = new Anime("Saiki K", LocalDate.of(2016, 07, 04),
                "Saiki has powers....................................................................................",
                8.4, 120, true, "https://media.kitsu.io/anime/poster_images/13477/small.jpg", "https://media.kitsu.io/anime/cover_images/13477/large.jpg");
        Anime deathParade = new Anime("Death Parade", LocalDate.of(2015, 01, 9), "After death, there is no heaven or hell, only a bar that stands between reincarnation " +
                "and oblivion. There the attendant will, one after another, challenge pairs of the recently deceased to a random game in which their fate",
                7.9, 12, true, "https://media.kitsu.io/anime/poster_images/9969/small.jpg", "https://media.kitsu.io/anime/cover_images/9969/large.jpg");
        Anime clannad = new Anime("Clannad", LocalDate.of(2004, 04, 28), "Tomoya Okazaki is a delinquent who finds life dull and believes he'll never amount to anything."+
                " Along with his friend Sunohara, he skips school and plans to waste his high school days away.\\nOne day while walking to school,",
                7.8, 24, true, "https://media.kitsu.io/anime/poster_images/1962/small.jpg", "https://media.kitsu.io/anime/cover_images/1962/large.jpg");
        Anime clannadAfterStory = new Anime("Clannad After Story", LocalDate.of(2008, 10, 03),
                "Clannad: After Story, the sequel to the critically acclaimed slice-of-life series Clannad, begins after Tomoya Okazaki and Nagisa Furukawa graduate from high school." +
                        " Together, they experience the emotional rollercoaster of growing up.",
                8.6, 25, true, "https://media.kitsu.io/anime/poster_images/3505/small.jpg", "https://media.kitsu.io/anime/cover_images/3505/large.jpg");
        Anime durarara = new Anime("Durarara", LocalDate.of(2010, 01, 8), "In Tokyo's downtown district of Ikebukuro, amidst many strange rumors " +
                "and warnings of anonymous gangs and dangerous occupants, one urban legend stands out above the rest—the existence of a headless Black Rider",
                8.1, 26, true, "https://media.kitsu.io/anime/poster_images/4696/small.jpg", "https://media.kitsu.io/anime/cover_images/4696/large.jpg");
        Anime owariNoSeraph = new Anime("Owari no Seraph", LocalDate.of(2015, 04, 04), "With the appearance of a mysterious virus that kills everyone above the age of 13," +
                " mankind becomes enslaved by previously hidden, power-hungry vampires who emerge in order to subjugate society with the promise of protecting the survivors",
                7.9, 24, true, "https://media.kitsu.io/anime/poster_images/8736/small.jpg", "https://media.kitsu.io/anime/cover_images/8736/large.jpg");
//        ROMANCE
        Anime kimiNiTodoke = new Anime("Kimi Ni Todoke", LocalDate.of(2009, 10, 06),
                "Kuronuma Sawako is completely misunderstood by her classmates. Her timid and sweet demeanor is often mistaken for malicious behavior." +
                        " This is due to her resemblance to the ghost girl from The Ring",
                7.8, 37, true, "https://media.kitsu.io/anime/poster_images/4397/small.jpg", "https://media.kitsu.io/anime/cover_images/4397/large.jpg");
        Anime fruitsBasket = new Anime("Fruits Basket", LocalDate.of(2019, 04, 05),
                "The Sohma family has been cursed for generations. When a member of the clan is embraced by a person of the opposite sex,"+
                        " they transform into an animal from the Chinese Zodiac! After keeping their secret hidden for years,",
                8.6, 63, true, "https://media.kitsu.io/anime/poster_images/99/small.jpg", "https://media.kitsu.io/anime/cover_images/99/large.jpg");
        Anime sayILoveYou = new Anime("Say I Love You", LocalDate.of(2012, 10, 06),
                "Mei Tachibana was once a regular girl who enjoyed hanging out with her friends. " +
                        "But after a traumatic incident where all her so-called friends suddenly turned their backs on her, Mei's idea of friendship changed forever.",
                7.3, 13, true, "https://media.kitsu.io/anime/poster_images/7109/small.jpg", "https://media.kitsu.io/anime/cover_images/7109/large.jpg");
        Anime charlotte = Anime("Charlotte", LocalDate.of(2015, 07, 04),
                        "Very few adolescent boys and girls have an onset of special abilities. Yu Otosaka is one such" +
                                " man who uses his ability unbeknownst to others in order to lead a satisfying school life. Then one day, a girl named Nao Tomori suddenly appears before him.",
                7.5, 13, true, "https://media.kitsu.io/anime/poster_images/10103/small.jpg", "https://media.kitsu.io/anime/cover_images/10103/large.jpg");

//        SUSPENSE

//        MYSTERY

//        SCI-FI




//      Add Genre
        Genre comedy = new Genre("Comedy", Arrays.asList(onePunchMan, assinationClassroom, mobPsycho100, blackClover,
                dragonBall, dragonBallZ, yuyuHakusho, gintama, inuyasha, trigun, cardCaptorSakura, goldenBoy, hajimeNoIppo,
                theMelancholyOfHaruhiSuzumiya));
        Genre action = new Genre("Action", Arrays.asList(naruto, narutoShippuden, bleach, bungoStrayDogs2, attackOnTitan,
                onePunchMan, assinationClassroom, mobPsycho100, blackClover, onePiece,jojosBizzareAdventure2012,
                yuyuHakusho, gintama, hunterXHunter, inuyasha, fullMetalAlchemists, trigun, myHeroAcademia, neonGenisisEvangelion,
                cowboyBebop, fairyTale, hajimeNoIppo));
        Genre ecchi = new Genre("Ecchi", Arrays.asList(goldenBoy));
        Genre sports = new Genre("Sports", Arrays.asList(slamDunk, haikyuu, kurokosBasketball, hajimeNoIppo, free, yuriOnIce, pingPong, chihayafuru, sk8TheInfinity));
        Genre adventure = new Genre("Adventure", Arrays.asList(naruto, narutoShippuden, bleach ,
                jojosBizzareAdventure2012, onePunchMan, dragonBall, dragonBallZ, hunterXHunter, inuyasha,
                fullMetalAlchemists, trigun, cardCaptorSakura, fairyTale, goldenBoy, sk8TheInfinity,gosick));
        Genre supernatural = new Genre("Supernatural", Arrays.asList(owariNoSeraph, jojosBizzareAdventure2012, mobPsycho100,
                bungoStrayDogs2, deathNote, yuyuHakusho, inuyasha, angelBeats, saikiK, deathParade, clannad, clannadAfterStory, durarara));
        Genre fantasy = new Genre("Fantasy", Arrays.asList(naruto, narutoShippuden, blackClover, bleach, onePiece,
                dragonBall, dragonBallZ, hunterXHunter, inuyasha, fullMetalAlchemists, cardCaptorSakura,fairyTale));
        Genre drama = new Genre("Drama", Arrays.asList(attackOnTitan, fullMetalAlchemists, trigun, neonGenisisEvangelion,
                cardCaptorSakura, gosick, kurokosBasketball, bluePeriod, violetEvergarden, ninetyOneDays, claymore, steinsGate, tokyoRevengers));
        Genre mystery = new Genre("Mystery", Arrays.asList(bungoStrayDogs2, aPromisedNeverland, another, theMelancholyOfHaruhiSuzumiya,
                gosick, mononoke, boogiepopPhantom));
        Genre suspense = new Genre("Suspense", Arrays.asList(deathNote, aPromisedNeverland, terrorInResonance));
        Genre sciFi = new Genre("Sci-Fi", Arrays.asList(gintama, trigun, neonGenisisEvangelion, cowboyBebop, aPromisedNeverland));
        Genre romance = new Genre("Romance", Arrays.asList(chihayafuru, inuyasha, sailorMoon, cardCaptorSakura, clannad, clannadAfterStory, violetEvergarden,
                kimiNiTodoke, fruitsBasket, sayILoveYou, charlotte));
        Genre avantGarde = new Genre("Avant Garde", Arrays.asList(neonGenisisEvangelion));

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
                trigun, neonGenisisEvangelion, cowboyBebop, aPromisedNeverland, sailorMoon, cardCaptorSakura, fairyTale, goldenBoy,
                myHeroAcademia, terrorInResonance, hajimeNoIppo, free, yuriOnIce, pingPong, chihayafuru, sk8TheInfinity, another, theMelancholyOfHaruhiSuzumiya,
                gosick, mononoke, boogiepopPhantom, bluePeriod, violetEvergarden, ninetyOneDays, claymore, steinsGate, tokyoRevengers,
                angelBeats, saikiK, deathParade, clannad, clannadAfterStory, durarara, owariNoSeraph, kimiNiTodoke, fruitsBasket, sayILoveYou, charlotte));
        userRepository.saveAll(Arrays.asList(user1, user2, user3, user4, user5, user6, user7, user8, user9, user10,
                user11, user12));
        watchListRepository.saveAll(Arrays.asList(watchList1,watchList2,watchList3,watchList4,watchList5, watchList6,
                watchList7, watchList8, watchList9, watchList10, watchList11, watchList12, watchList13, watchList14,
                watchList15,watchList16, watchList17, watchList18,watchList19,watchList20,watchList21, watchList22,
                watchList23, watchList24, watchList25, watchList26, watchList27,watchList28, watchList29, watchList30));
        genreRepository.saveAll(Arrays.asList(comedy, action, ecchi, sports, adventure, supernatural, fantasy, drama,
                mystery, sciFi, suspense, romance, avantGarde));
    }
}
