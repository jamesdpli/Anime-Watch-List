import { useParams } from "react-router-dom";
import { useEffect, useState } from "react";
import "./renderedAnime.css"
import Footer from "../Footer/Footer";

const RenderedAnime = ({ renderedAnime }) => {

  const params = useParams();

  const [chosenAnime, setchosenAnime] = useState();

  const [animesDecription, setAnimesDescription] = useState("");

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

  useEffect(() => {
    fetch("https://kitsu.io/api/edge/anime?filter[text]=" + params.animeName)
    .then(res => res.json())
    .then(animeDescriptionData => setAnimesDescription(animeDescriptionData.data[0].attributes.description))
  })

  return (
    <>
      {
        chosenAnime ? (
        <>
          {
          <div className="container-dynamic">
            <header className="banner-dynamic">
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
              {/* <p>{animeDescription}</p> */}
              <p>{animesDecription}</p>
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

