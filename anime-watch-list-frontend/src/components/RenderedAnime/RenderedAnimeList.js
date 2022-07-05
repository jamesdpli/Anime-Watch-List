import { useState, useEffect } from "react";
import RenderedAnime from "./RenderedAnime"

const RenderedAnimeList = () => {
  const [renderedAnime, setRenderedAnime] = useState([]);

  useEffect(() => {
    fetch("http://localhost:8080/animes")
      .then((response) => response.json())
      .then((data) => setRenderedAnime(data));
   
  }, []);

  // useEffect(() => {
  //   console.log(renderedAnime)

  

  // }, [renderedAnime]);
  

  return (
    <>
      <RenderedAnime renderedAnime={renderedAnime} />
    </>
  );
};


export default RenderedAnimeList