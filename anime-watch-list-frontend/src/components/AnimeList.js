import Anime from "./Anime";


const AnimeList = ({animes, deleteAnime }) => {

    const animesComponents = animes.map(anime => {
        return <Anime key = {anime.id} anime = {anime} deleteAnime={deleteAnime} />
    })

    return(
        <>
        <div className="anime">
        {animesComponents}
        </div>
        </>
    );
}

export default AnimeList;