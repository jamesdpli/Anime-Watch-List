import usePersistedState from "./usePersistedState";
import {useEffect, useState} from 'react';


const WatchedEpisodeList = ({currentAnimeAcc, setCurrentAnimeAcc}) => {
    
    const [watchedEpisodes, setWatchedEpisodes] = usePersistedState('watchedEpisodes',[]);

    useEffect(() => {
        fetch(`http://localhost:8080/users/${currentAnimeAcc.id}`)
        .then(response => response.json())
        .then(data => setCurrentAnimeAcc(data))

        setWatchedEpisodes(currentAnimeAcc.watchedEpisodes);
    },[currentAnimeAcc])


    const handleUnwatch = (id) => {
        // update backend database
        fetch(`http://localhost:8080/users/deletewatched/${currentAnimeAcc.id}/${id}`, 
            {
                method:'DELETE',
                headers: { "Content-Type": "application/json" }
            }
        )

        // update local front end
        setWatchedEpisodes(prevs => prevs.filter(e => e.id != id))
    }

    const episodesMap = watchedEpisodes.map(e => {
        return (
            <div className="single-episodes-container">
                <h3 className="episode-title">{e.name}</h3>
                <ul className="episode-ul">
                    <li>{e.datePosted} {e.duration} minutes</li>
                    <li>Description 📖 {e.description}</li>
                    
                </ul>
                <button onClick={() => handleUnwatch(e.id)} className="unwatch-btn">Unwatch</button>
            </div>

        );
    })



    
    return (
        <div className="watch-episodes-container">
            <h3 className="recent-watch-title">Recently Watched</h3>
            {episodesMap}

        </div>
    );
}

export default WatchedEpisodeList;