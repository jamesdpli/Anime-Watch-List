import { BrowserRouter as Router, Routes, Route, Link, Outlet } from 'react-router-dom';

const Anime = ({ anime, deleteAnime }) => {

const handleDeleteAnime = () => {
    deleteAnime(anime.id);
};


return (
    <div>
    <h3 id="anime-title">{anime.title}</h3>
    <ul className="anime-ul">
        <label className="anime-desc">Description: </label>
        <li>{anime.description}</li>
        <br />
        <label className="anime-contentNote">Content note: </label>
        <li>{anime.contentNote}</li>
        <br />

        <label className="anime-category">Podcast category: </label>
        <li> {anime.category}</li>
        <br />

        <label className="anime-rating">Podcast rating: </label>
        <li>{anime.rating}/5</li>
        <br />

        <label className="anime-sources">Podcast sources: </label>
        <li>{anime.sources}</li>
        <br />

    </ul>
    <div className="anime-btns">
        <button onClick={handleDeleteAnime} id="delete-btn" >Delete</button>
    </div>
    </div>
);
};

export default Anime;
