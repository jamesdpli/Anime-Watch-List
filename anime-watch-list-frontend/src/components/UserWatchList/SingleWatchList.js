import "./SingleWatchList.css"

const SingleWatchList = ({ eachAnimeInWatchList,
    deleteWatchList,
    watchListId,
    setUserWatchListAnimes,
     }) => {


  

    const handleRemoveWatchList = () => {
        deleteWatchList(watchListId)


   

    }


    const genres = eachAnimeInWatchList.genres
    const eachGenre = genres.map(genre => {
       return <h5 key={genre.id} className="each-genre">{genre.name}</h5>
    })

    return (
        <>
            <div className="singleWatchList-container">

                <div className="watchList-image-container">
                    <img src={eachAnimeInWatchList.imageUrl}/>
                    </div>

                    <div className="anime-info-container">

                     
                            <h2> {eachAnimeInWatchList.name}</h2>
                            
                        <div className="anime-info-parentContainer">
                        <div className="anime-info-leftContainer">
                        <div className="anime-info1">
                            {/* <h5>Sub/Dub/R/HD</h5> */}
                            <h4> Episodes: {eachAnimeInWatchList.numberOfEps}/{eachAnimeInWatchList.numberOfEps} </h4>
                            <h5> 24mins/Ep </h5>

                        </div>
                      
                        <div className="genre-container2">
                            <h4>Genres: </h4>
                             {eachGenre}

                        </div>
                        </div>
                        <div className="anime-info-rightContainer">
                        <div className="description">
                            <h4>Description: {eachAnimeInWatchList.description}</h4>
                        </div>
                        </div>
                        </div>
                        </div>
                        <div className="btn-container">
                        <button onClick={handleRemoveWatchList}>X</button>
                        </div>

                    
            
               

            </div>
        </>
    )
}

export default SingleWatchList;