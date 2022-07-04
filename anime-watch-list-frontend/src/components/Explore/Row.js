import React from "react";
import "./Row.css";

function Row({ animes }) {

return (

    // Link with backend for fetching images 
    <div className="row">
    <h2>This is a title test</h2>
    <div className="row-posters">
    <img className="row-poster"
        src={
        "https://thesmartlocal.com/japan/wp-content/uploads/2020/03/Top-Anime-Movies-21.jpg"
        }
        alt="poster"
    />
    <img className="row-poster"
        src={
        "https://m.media-amazon.com/images/M/MV5BM2MxY2QwYTAtMDM1My00MTc0LWEwZjktMDdjODY2NWJiNDg2XkEyXkFqcGdeQXVyODY3ODQ2MTk@._V1_.jpg"
        }
        alt="poster"
    />
        <img className="row-poster"
        src={
        "https://static.posters.cz/image/750/posters/one-punch-man-destruction-i61133.jpg"
        }
        alt="poster"
    /><img className="row-poster"
    src={
        "https://m.media-amazon.com/images/M/MV5BY2I2MzI1ODYtMWRlOS00MzdhLWEyOWEtYWJhNmFiZTIxMGJhXkEyXkFqcGdeQXVyMTExNDQ2MTI@._V1_.jpg"
    }
    alt="poster"
    /><img className="row-poster" 
    src={"https://m.media-amazon.com/images/M/MV5BNTk1NTc0MTYtY2IyNC00OWVjLWJhYWItNDQ0ODdiNWZkYTA5XkEyXkFqcGdeQXVyMTQ3MjMyMTYz._V1_FMjpg_UX1000_.jpg"} alt="poster"/>
    <img className="row-poster" 
    src={"https://i.ebayimg.com/images/g/BgUAAOSwaCBg6aUT/s-l500.jpg"} alt="poster"/>
    <img className="row-poster"
        src={
        "https://i.ebayimg.com/images/g/iIcAAOSwGXNgSkHt/s-l500.jpg"
        }
        alt="poster"
        />
        </div>
    </div>
);
}

export default Row;
