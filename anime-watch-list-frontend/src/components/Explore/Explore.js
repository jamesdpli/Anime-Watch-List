import { useEffect, useState } from "react";
import Row from "./Row";
import Banner from "./Banner";
import './Explore.css';
import SearchBar from "./SearchBar";
import Request from "../Requests";
import Nav from "./Nav";


const Explore = () => {
    const [animes, setAnimes] = useState([]);

    useEffect(() => {
    fetch("https://kitsu.io/api/edge//anime?filter[categories]=adventure", {
        method: "GET",
        headers: {
        Accept: "application/vnd.api+json",
        "Content-Type": "application/vnd.api+json",
        },
    })
        .then((response) => response.json())
        .then((data) => console.log(data))
        .catch((err) => console.log(err));
    }, []);

    return(

        <div className="homeScreen">
            {/* <Nav/> */}
            <Banner/>
            <br/>
            <SearchBar/>
      {/* <AnimeList animesGenre={animesGenre}/> */}
            <Row title="Comedy" fetchUrl={Request.fetchComedyAnimes} />
            <Row title="Action" fetchUrl={Request.fetchActionAnimes} />
            <Row title="Ecchi" fetchUrl={Request.fetchEcchiAnimes} />
            <Row title="Sports" fetchUrl={Request.fetchSportsAnimes} />
            <Row title="Adventure" fetchUrl={Request.fetchAdventureAnimes} />
            <Row title="Super Natural" fetchUrl={Request.fetchSupernaturalAnimes} />
            <Row title="Fantasy" fetchUrl={Request.fetchFantasyAnimes} />
            <Row title="Drama" fetchUrl={Request.fetchDramaAnimes} />
            <Row title="Mystery" fetchUrl={Request.fetchMysteryAnimes} />
            <Row title="ScFi" fetchUrl={Request.fetchSciFiAnimes} />
            <Row title="Suspense" fetchUrl={Request.fetchSuspenseAnimes} />
            <Row title="Romance" fetchUrl={Request.fetchRomanceAnimes} />
            <Row title="Avant Garde" fetchUrl={Request.fetchAvantGardeAnimes} />
        </div>
        );


}

export default Explore;