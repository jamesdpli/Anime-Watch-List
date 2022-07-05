import { useParams } from "react-router-dom";
import { useEffect, useState } from "react";
import "./renderedAnime.css"
import Footer from "../Footer/Footer";

const RenderedAnime = ({ renderedAnime,
                         loggedInUser, 
                         addToWatchList
                        }) => {
  const params = useParams();

  const [chosenAnime, setchosenAnime] = useState();
  const [selectedAnime, setSelectedAnime] = useState();


  useEffect(() => {
    if (renderedAnime.length) {
      let filterChecker = renderedAnime.filter((anime) => {
        if (anime.name === params.animeName) {
          return anime;
        }
        return null;
      });
      setSelectedAnime(filterChecker[0])
      setchosenAnime(filterChecker);
    }
  }, [renderedAnime, params.animeName]);







  const[userWatchList, setUserWatchList] = useState(
    { 
      user:{},
      anime:{}
     }
  );

  const handleAddToWatchList = () =>{
    userWatchList.anime = selectedAnime
    userWatchList.user = loggedInUser

    console.log(userWatchList)
    addToWatchList(userWatchList)   
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
            <p>{chosenAnime[0].description}</p>
          </div>

          </div>


          <Footer/>
            </div>

          }
        </>
      ) : (
        ""
      )}

<button onClick={handleAddToWatchList}>Add</button>

    </>
  );
};

export default RenderedAnime;

