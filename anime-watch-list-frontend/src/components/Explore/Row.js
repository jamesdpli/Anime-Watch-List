import React from "react";
import "./Row.css";
import { useState, useEffect } from "react";
import axios from "../axios";
import { Link } from "react-router-dom";

function Row({ fetchUrl }) {
  const [animeGenre, setAnimeGenre] = useState([]);

  useEffect(() => {
    async function fetchData() {
      const request = await axios.get(fetchUrl);
      setAnimeGenre(request.data);
      return request;
    }

    fetchData();
  }, [fetchUrl]);

  

  return (
    <div className="row">
      <h2>{animeGenre.name}</h2>
      <div className="row-posters">
        {animeGenre.animes?.map((anime) => (
          <Link to={`/explore/${anime.name}`}>
              <img
                className="row-poster"
                src={anime.imageUrl}
                alt={anime.name}
                key={anime.id}
              />
          </Link>
          
          ))}
      </div>
    </div>
  );
}

export default Row;
