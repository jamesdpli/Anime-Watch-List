import { useParams } from "react-router-dom";
import { useEffect, useState } from "react";
import "./renderedAnime.css"
import Footer from "../Footer/Footer";

const RenderedAnime = ({ renderedAnime }) => {

  const params = useParams();

  const [chosenAnime, setchosenAnime] = useState();

  let animeDescription = "";

  useEffect(() => {
    if (renderedAnime.length) {
      let filterChecker = renderedAnime.filter((anime) => {
        if (anime.name === params.animeName) {
          return anime;
        }
        return null;
      });
      setchosenAnime(filterChecker);
    }
  }, [renderedAnime, params.animeName]);

  switch(params.animeName) {
    case "Naruto":
      animeDescription = "Moments prior to Naruto Uzumaki's birth, a huge demon known as the Kyuubi, the Nine-Tailed Fox, attacked Konohagakure, the Hidden Leaf Village, and wreaked havoc. In order to put an end to the Kyuubi's rampage, the leader of the village, the Fourth Hokage, sacrificed his life and sealed the monstrous beast inside the newborn Naruto.\nNow, Naruto is a hyperactive and knuckle-headed ninja still living in Konohagakure. Shunned because of the Kyuubi inside him, Naruto struggles to find his place in the village, while his burning desire to become the Hokage of Konohagakure leads him not only to some great new friends, but also some deadly foes."
      break;
    case "Naruto Shippuden":
      animeDescription = "It has been two and a half years since Naruto Uzumaki left Konohagakure, the Hidden Leaf Village, for intense training following events which fueled his desire to be stronger. Now Akatsuki, the mysterious organization of elite rogue ninja, is closing in on their grand plan which may threaten the safety of the entire shinobi world.\n\nAlthough Naruto is older and sinister events loom on the horizon, he has changed little in personality—still rambunctious and childish—though he is now far more confident and possesses an even greater determination to protect his friends and home. Come whatever may, Naruto will carry on with the fight for what is important to him, even at the expense of his own body, in the continuation of the saga about the boy who wishes to become Hokage."
      break;
    case "Bleach":
      animeDescription = "Ichigo Kurosaki is an ordinary high schooler—until his family is attacked by a Hollow, a corrupt spirit that seeks to devour human souls. It is then that he meets a Soul Reaper named Rukia Kuchiki, who gets injured while protecting Ichigo's family from the assailant. To save his family, Ichigo accepts Rukia's offer of taking her powers and becomes a Soul Reaper as a result.\nHowever, as Rukia is unable to regain her powers, Ichigo is given the daunting task of hunting down the Hollows that plague their town. However, he is not alone in his fight, as he is later joined by his friends—classmates Orihime Inoue, Yasutora Sado, and Uryuu Ishida—who each have their own unique abilities. As Ichigo and his comrades get used to their new duties and support each other on and off the battlefield, the young Soul Reaper soon learns that the Hollows are not the only real threat to the human world."
      break;
    case "Attack on Titan":
      animeDescription = "Centuries ago, mankind was slaughtered to near extinction by monstrous humanoid creatures called titans, forcing humans to hide in fear behind enormous concentric walls. What makes these giants truly terrifying is that their taste for human flesh is not born out of hunger but what appears to be out of pleasure. To ensure their survival, the remnants of humanity began living within defensive barriers, resulting in one hundred years without a single titan encounter. However, that fragile calm is soon shattered when a colossal titan manages to breach the supposedly impregnable outer wall, reigniting the fight for survival against the man-eating abominations.\n\nAfter witnessing a horrific personal loss at the hands of the invading creatures, Eren Yeager dedicates his life to their eradication by enlisting into the Survey Corps, an elite military unit that combats the merciless humanoids outside the protection of the walls. Based on Hajime Isayama's award-winning manga, Shingeki no Kyojin follows Eren, along with his adopted sister Mikasa Ackerman and his childhood friend Armin Arlert, as they join the brutal war against the titans and race to discover a way of defeating them before the last walls are breached."
      // No clue why IDE does not highlight it orange 😁
      break;
    case "One Piece":
      animeDescription = "Gol D. Roger was known as the \"Pirate King,\" the strongest and most infamous being to have sailed the Grand Line. The capture and death of Roger by the World Government brought a change throughout the world. His last words before his death revealed the existence of the greatest treasure in the world, One Piece. It was this revelation that brought about the Grand Age of Pirates, men who dreamed of finding One Piece—which promises an unlimited amount of riches and fame—and quite possibly the pinnacle of glory and the title of the Pirate King.\nEnter Monkey D. Luffy, a 17-year-old boy who defies your standard definition of a pirate. Rather than the popular persona of a wicked, hardened, toothless pirate ransacking villages for fun, Luffy’s reason for being a pirate is one of pure wonder: the thought of an exciting adventure that leads him to intriguing people and ultimately, the promised treasure. Following in the footsteps of his childhood hero, Luffy and his crew travel across the Grand Line, experiencing crazy adventures, unveiling dark mysteries and battling strong enemies, all in order to reach the most coveted of all fortunes—One Piece."
      break;
    case "Haikyuu":
      animeDescription = "Inspired after watching a volleyball ace nicknamed \"Little Giant\" in action, small-statured Shouyou Hinata revives the volleyball club at his middle school. The newly-formed team even makes it to a tournament; however, their first match turns out to be their last when they are brutally squashed by the \"King of the Court,\" Tobio Kageyama. Hinata vows to surpass Kageyama, and so after graduating from middle school, he joins Karasuno High School's volleyball team—only to find that his sworn rival, Kageyama, is now his teammate.\n\nThanks to his short height, Hinata struggles to find his role on the team, even with his superior jumping power. Surprisingly, Kageyama has his own problems that only Hinata can help with, and learning to work together appears to be the only way for the team to be successful. Based on Haruichi Furudate's popular shounen manga of the same name, Haikyuu!! is an exhilarating and emotional sports comedy following two determined athletes as they attempt to patch a heated rivalry in order to make their high school volleyball team the best in Japan."
      break;
    case "Kuroko's Basketball":
      animeDescription = "Teikou Junior High School's basketball team is crowned champion three years in a row thanks to five outstanding players who, with their breathtaking and unique skills, leave opponents in despair and fans in admiration. However, after graduating, these teammates, known as \"The Generation of Miracles,\" go their separate ways and now consider each other as rivals.\nAt Seirin High School, two newly recruited freshmen prove that they are not ordinary basketball players: Taiga Kagami, a promising player returning from the US, and Tetsuya Kuroko, a seemingly ordinary student whose lack of presence allows him to move around unnoticed. Although Kuroko is neither athletic nor able to score any points, he was a member of Teikou's basketball team, where he played as the \"Phantom Sixth Man,\" who easily passed the ball and assisted his teammates.Kuroko no Basket follows the journey of Seirin's players as they attempt to become the best Japanese high school team by winning the Interhigh Championship. To reach their goal, they have to cross pathways with several powerful teams, some of which have one of the five players with godlike abilities, whom Kuroko and Taiga make a pact to defeat."
      break;
    case "Bungo Stray Dogs 2":
      animeDescription = "Guild has entered Yokohoma city. Along with the city, they want Atsushi of The Armed Detective Agency too. As Port Mafia want the city for themselves, a three way war seems unavoidable. While fighting, Atsushi &amp; Akutagawa find help in strange places. And in the background, Dazai continues his endless scheming."
      break;
    case "":
      animeDescription = ""
      break;
    default:
      animeDescription = "";
      break;
  }

  return (
    <>
      {chosenAnime ? (
        <>
          { <div className="container-dynamic">
            <header
            className="banner-dynamic">
            <img src={chosenAnime[0].bannerImage} alt={chosenAnime[0].name}/>
            {/* <div className="banner--fadeButtom" /> */}
          </header>

          <div className="content-dynamic">
          <div className="content-left-dynamic">
            <img src={chosenAnime[0].imageUrl} alt={chosenAnime[0].name}/>
          </div>
          <div className="content-right-dynamic">
            <h1>{chosenAnime[0].name}</h1>
            {/* <p>{chosenAnime[0].description}</p> */}
            <p>{animeDescription}</p>
          </div>

          </div>


          <Footer/>
            </div>

          }
        </>
      ) : (
        ""
      )}
    </>
  );
};

export default RenderedAnime;

