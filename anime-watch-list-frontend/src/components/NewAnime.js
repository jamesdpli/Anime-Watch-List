import { useState } from "react";
const NewAnime = ({ postAnime }) => {

    const [stateAnime, setStateAnime] = useState(
        {
            title: "",
            genre:"",
            description: "",
            rating: 0,
        }
    )

    const handleChange = (event) => {
        console.log(event)
        let propertyName = event.target.name;
        let copiedAnime = { ...stateAnime }
        copiedAnime[propertyName] = event.target.value;
        setStateAnime(copiedAnime)
    }

    const handleSubmit = (event) => {
        event.preventDefault();
        postAnime(stateAnime)
    }

    return (
        <div className="newForm">
            <form onSubmit={handleSubmit}>
                <h3>Add a new anime: </h3>
                <label>Anime title</label>
                <input type="text"
                    placeholder="Anime title"
                    name="title"
                    onChange={handleChange}
                    value={stateAnime.title} required />

                <label>Anime genre</label>
                <input type="text"
                    placeholder="Anime genre"
                    name="genre"
                    onChange={handleChange}
                    value={stateAnime.genre} required />
    
                <label>Anime description</label>
                <input type="text"
                    placeholder="Anime description"
                    name="description"
                    onChange={handleChange}
                    value={stateAnime.description} required />

                <label>Anime rating</label>
                <input type="number" step="0.1"
                    min="0" max="5"
                    placeholder="Podcast rating"
                    name="rating"
                    onChange={handleChange}
                    value={statePodcast.rating} required />

                <button type="submit" className="submit-btn">Submit</button>
            </form>
        </div>
    );
}

export default NewAnime;