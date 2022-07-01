import { useEffect, useState } from "react";
import Row from "./Row";


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

const Explore = () =>{
    return(
        <div>
            <Row animes={animes} />
            <Row animes={animes} />
            <Row animes={animes} />
            <Row animes={animes} />
            <Row animes={animes} />
        </div>
    );

    }
}

export default Explore;