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

