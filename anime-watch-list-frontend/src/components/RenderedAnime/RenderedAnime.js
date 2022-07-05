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
      animeDescription = "t has been two and a half years since Naruto Uzumaki left Konohagakure, the Hidden Leaf Village, for intense training following events which fueled his desire to be stronger. Now Akatsuki, the mysterious organization of elite rogue ninja, is closing in on their grand plan which may threaten the safety of the entire shinobi world.\n\nAlthough Naruto is older and sinister events loom on the horizon, he has changed little in personality—still rambunctious and childish—though he is now far more confident and possesses an even greater determination to protect his friends and home. Come whatever may, Naruto will carry on with the fight for what is important to him, even at the expense of his own body, in the continuation of the saga about the boy who wishes to become Hokage."
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

