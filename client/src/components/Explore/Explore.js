import Row from "./Row";
import Banner from "./Banner";
import './Explore.css';
import SearchBar from "./SearchBar";
import Request from "../Requests";
import SearchByGenre from "./SearchByGenre";
import { useEffect, useState } from "react";

const Explore = () => {

    const [selectedGenre, setSelectedGenre] = useState("");
    const [genres, setGenres] = useState("");
    console.log(selectedGenre)

    useEffect(() => {
        fetch("http://localhost:8080/genres")
            .then(res => res.json())
            .then(genres => {
                setGenres(genres)

            })
    }, [])

    // {genres.length > 0 ? genres.map(eachGenre => console.log(eachGenre)) : <h2> No Genres :(</h2>}

    switch (selectedGenre) {
        case "Action":
            return <div className="selectedGenre"><Row title="Action" fetchUrl={Request.fetchActionAnimes} /></div>

        case "Comedy":

            return <div className="selectedGenre"><Row title="Comedy" fetchUrl={Request.fetchComedyAnimes} /></div>




        case "Ecchi":
            return <div className="selectedGenre"> </div>


        case "Sports":
            return <div className="selectedGenre">   <Row title="Sports" fetchUrl={Request.fetchSportsAnimes} />
            </div>

        case "Adventure":
            return <div className="selectedGenre"> <Row title="Adventure" fetchUrl={Request.fetchAdventureAnimes} />
            </div>

        case "Super Natural":
            return <div className="selectedGenre">  <Row title="Super Natural" fetchUrl={Request.fetchSupernaturalAnimes} /></div>

        case "Fantasy":
            return <div className="selectedGenre"> <Row title="Fantasy" fetchUrl={Request.fetchFantasyAnimes} /> </div>

        case "Drama":
            return <div className="selectedGenre"><Row title="Drama" fetchUrl={Request.fetchDramaAnimes} /> </div>

        case "Mystery":
            return <div className="selectedGenre"> <Row title="Mystery" fetchUrl={Request.fetchMysteryAnimes} /></div>

        case "ScFi":
            return <div className="selectedGenre"> <Row title="ScFi" fetchUrl={Request.fetchSciFiAnimes} /> </div>

        case "Suspense":
            return <div className="selectedGenre">  <Row title="Suspense" fetchUrl={Request.fetchSuspenseAnimes} /></div>
        case "Romance":
            return <div className="selectedGenre"> <Row title="Romance" fetchUrl={Request.fetchRomanceAnimes} /> </div>

        case "Avant Garde":
            return <div className="selectedGenre"> <Row title="Avant Garde" fetchUrl={Request.fetchAvantGardeAnimes} /></div>




    }


    return (
        <div className="homeScreen">
            {/* <Nav/> */}
            <Banner />
            <br />
            <SearchBar />
            {genres.length > 0 ? <SearchByGenre setSelectedGenre={setSelectedGenre} genres={genres} /> : <h2> No genres found :(</h2>}

            {/* <AnimeList animesGenre={animesGenre}/> */}


            <Row title="Comedy" fetchUrl={Request.fetchComedyAnimes} />
            <Row title="Action" fetchUrl={Request.fetchActionAnimes} />
            {/* <Row title="Ecchi" fetchUrl={Request.fetchEcchiAnimes} /> */}
            <Row title="Sports" fetchUrl={Request.fetchSportsAnimes} />
            <Row title="Adventure" fetchUrl={Request.fetchAdventureAnimes} />
            <Row title="Super Natural" fetchUrl={Request.fetchSupernaturalAnimes} />
            <Row title="Fantasy" fetchUrl={Request.fetchFantasyAnimes} />
            <Row title="Drama" fetchUrl={Request.fetchDramaAnimes} />
            <Row title="Mystery" fetchUrl={Request.fetchMysteryAnimes} />
            <Row title="ScFi" fetchUrl={Request.fetchSciFiAnimes} />
            <Row title="Suspense" fetchUrl={Request.fetchSuspenseAnimes} />
            <Row title="Romance" fetchUrl={Request.fetchRomanceAnimes} />
            {/* <Row title="Avant Garde" fetchUrl={Request.fetchAvantGardeAnimes} /> */}
        </div>
    );


}

export default Explore;